package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.MenuItem;
import kr.co.fastcampus.eatgo.domain.MenuItemRepository;
import kr.co.fastcampus.eatgo.domain.Restaurant;
import kr.co.fastcampus.eatgo.domain.RestaurantRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

class RestaurantServiceTests {

    private RestaurantService restaurantService;

    @Mock
    private RestaurantRepository restaurantRepository;
    @Mock
    private MenuItemRepository menuItemRepository;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        restaurantService = new RestaurantService(restaurantRepository, menuItemRepository);
    }
    @Test
    public void getRestaurant() {
        long testId = 1004L;
        Restaurant mockRestaurant = Restaurant.builder().id(testId).name("Meal").address("Seoul").build();
        String testMenuItem = "Kimchi";
        List<MenuItem> testMenuItems = asList(MenuItem.builder().name(testMenuItem).build());
        mockRestaurant.setMenuItems(testMenuItems);
        given(restaurantRepository.findById(testId)).willReturn(Optional.of(mockRestaurant));

        Restaurant restaurant = restaurantService.getRestaurant(testId);
        assertEquals(testId, restaurant.getId());

        MenuItem menuItem = restaurant.getMenuItems().get(0);
        assertEquals(testMenuItem, menuItem.getName());
    }

    @Test
    public void getRestaurants() {
        List<Restaurant> mockRestaurants = new ArrayList<>(asList(Restaurant.builder().id(1004L).name("Meal").address("Seoul").build()));
        given(restaurantRepository.findAll()).willReturn(mockRestaurants);

        Restaurant restaurant = restaurantService.getRestaurants().get(0);
        assertEquals(1004L, restaurant.getId());
    }

    @Test
    public void addRestaurant() {
        Restaurant mockRestaurant = Restaurant.builder().id(1234L).name("Meal").address("Seoul").build();
        given(restaurantRepository.save(any())).willReturn(mockRestaurant);

        Restaurant restaurant = Restaurant.builder().name("Meal").address("Seoul").build();
        Restaurant created = restaurantService.addRestaurant(restaurant);

        assertEquals(1234L, created.getId());
    }

    @Test
    public void updateRestaurant() {
        Restaurant restaurant = Restaurant.builder().id(1L).name("Meal").address("Seoul").build();
        given(restaurantRepository.findById(1L)).willReturn(Optional.of(restaurant));

        restaurantService.updateRestaurant(1L, "Meal", "Busan");

        assertEquals("Busan", restaurant.getAddress());
    }
}