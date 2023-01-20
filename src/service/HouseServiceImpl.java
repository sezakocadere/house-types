package service;

import entity.House;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Collectors;

public class HouseServiceImpl implements HouseService {
    @Override
    public BigDecimal sumPriceOfHouse(List<House> houses) {
        return houses.stream().map(House::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public BigDecimal averageAreaOfHouse(List<House> houses) {
        return houses.stream().map(House::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add).divide(BigDecimal.valueOf(houses.size()), RoundingMode.HALF_UP);
    }

    @Override
    public List<House> filterHousesByRoomNumbers(List<House> houses, int numberOfRoom, int numberOfLivingRoom) {
        return houses.stream().filter(house -> house.getNumberOfRoom() == numberOfRoom && house.getNumberOfLivingRoom() == numberOfLivingRoom).collect(Collectors.toList());
    }
}
