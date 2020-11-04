package kr.co.fastcampus.eatgo.domain;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private Long id;
    private String name;
    private String address;

    public String getInformation() {
        return name + " in " + address;
    }
}
