package service;

import entity.House;

import java.math.BigDecimal;
import java.util.List;

public interface HouseService {
    public BigDecimal sumPriceOfHouse(List<House> houses);

    public BigDecimal averageAreaOfHouse(List<House> houses);

    public List<House> filterHousesByRoomNumbers(List<House> houses, int numberOfRoom, int numberOfLivingRoom);

}
