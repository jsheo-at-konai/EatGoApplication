package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTests {

    @Test
    public void creation() {
        Restaurant restaurant = Restaurant.builder().id(1004L).name("Meal").address("Seoul").build();

        assertEquals(1004L, restaurant.getId());
        assertEquals("Meal", restaurant.getName());
        assertEquals("Seoul", restaurant.getAddress());
    }

    @Test
    public void information() {
        Restaurant restaurant = Restaurant.builder().id(1004L).name("Meal").address("Seoul").build();

        assertEquals("Meal in Seoul", restaurant.getInformation());
    }

}