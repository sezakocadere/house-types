package util;

import entity.House;
import enums.HouseType;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class HouseDataUtility {
    private static final List<House> houses = prepareHouseList();

    private static List<House> prepareHouseList() {
        return List.of(
                House.builder().area(50).numberOfRoom(5).numberOfLivingRoom(2).price(BigDecimal.valueOf(496.056)).type(HouseType.HOME).build(),
                House.builder().area(50).numberOfRoom(5).numberOfLivingRoom(1).price(BigDecimal.valueOf(496.056)).type(HouseType.HOME).build(),
                House.builder().area(490).numberOfRoom(10).numberOfLivingRoom(3).price(BigDecimal.valueOf(889.056)).type(HouseType.VILLA).build(),
                House.builder().area(496).numberOfRoom(6).numberOfLivingRoom(2).price(BigDecimal.valueOf(879.016)).type(HouseType.VILLA).build(),
                House.builder().area(140).numberOfRoom(4).numberOfLivingRoom(1).price(BigDecimal.valueOf(470.055)).type(HouseType.SUMMER_HOUSE).build(),
                House.builder().area(140).numberOfRoom(5).numberOfLivingRoom(2).price(BigDecimal.valueOf(470.055)).type(HouseType.SUMMER_HOUSE).build()
        );
    }

    public List<House> getHomes() {
        return houses.stream().filter(house -> house.getType() == HouseType.HOME).collect(Collectors.toList());
    }

    public List<House> getVillas() {
        return houses.stream().filter(house -> house.getType() == HouseType.VILLA).collect(Collectors.toList());
    }

    public List<House> getSummerHouses() {
        return houses.stream().filter(house -> house.getType() == HouseType.SUMMER_HOUSE).collect(Collectors.toList());
    }

    public List<House> getAllHouses() {
        return houses;
    }
}
