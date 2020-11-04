package kr.co.fastcampus.eatgo.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;

    @Transient
    private List<MenuItem> menuItems;

    public String getInformation() {
        return name + " in " + address;
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItem.setRestaurantId(this.id);

        if (null == menuItems) {
            menuItems = new ArrayList<>();
        }

        menuItems.add(menuItem);
    }
}
