import entity.House;
import service.HouseServiceImpl;
import util.HouseDataUtility;

import java.util.List;


public class Main {
    private static final String CURRENCY = " TRY";
    private static final String SQUARE_METERS = " sqft";

    public static void main(String[] args) {
        HouseDataUtility houseData = new HouseDataUtility();
        HouseServiceImpl houseService = new HouseServiceImpl();
        List<House> homes = houseData.getHomes();
        List<House> summerHouses = houseData.getSummerHouses();
        List<House> villas = houseData.getVillas();
        List<House> allHouses = houseData.getAllHouses();

        System.out.println("The system use default values. \n");
        System.out.println("Total price of homes is: " + houseService.sumPriceOfHouse(homes) + CURRENCY);
        System.out.println("Total price of villas is: " + houseService.sumPriceOfHouse(villas) + CURRENCY);
        System.out.println("Total price of summerhouses is: " + houseService.sumPriceOfHouse(summerHouses) + CURRENCY);
        System.out.println("Total price of all house types is: " + houseService.sumPriceOfHouse(allHouses) + CURRENCY);
        System.out.println("Average area of homes types is: " + houseService.averageAreaOfHouse(homes) + SQUARE_METERS);
        System.out.println("Average area price of villas is: " + houseService.averageAreaOfHouse(villas) + SQUARE_METERS);
        System.out.println("Average area price of summer house types is: " + houseService.averageAreaOfHouse(summerHouses) + SQUARE_METERS);
        System.out.println("Average area price of all house types is: " + houseService.averageAreaOfHouse(allHouses) + SQUARE_METERS);
        System.out.println("House types of " + 5 + " rooms and " + 2 + " living rooms: " + houseService.filterHousesByRoomNumbers(allHouses, 5, 2));
    }
}