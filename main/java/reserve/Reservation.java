package reserve;

import java.util.*;

public class Reservation {
    public ArrayList<Hotel> list;
    Scanner scanner =new Scanner(System.in);
    String hotelName1 = "LakeWood";
    String hotelName2 = "BridgeWood";
    String hotelName3 = "RidgeWood";
    int ratingOfLake = 3, ratingOfBridge = 4, ratingOfRidge = 5;

    public Reservation(){
        list = new ArrayList<>();
    }

    public void addDetails(String hotelName,int rating,int price) {
        Hotel hotel =new Hotel(hotelName,rating,price);
        list.add(hotel);
    }

    public void viewDetails() {
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public boolean getDetailsForNormal() {
        int lakeWeekday = 110, lakeWeekend = 90;
        int bridgeWeekday = 150, bridgeWeekend = 50;
        int ridWeekday = 220, ridWeekend = 150;
        System.out.println("Enter the number of Days to reserve");
        int numOfDays = scanner.nextInt();
        System.out.println("Enter 1 for weekday");
        System.out.println("Enter 2 for weekend");
        int dayType = scanner.nextInt();
        if (dayType == 1) {
            addDetails(hotelName1, ratingOfLake, numOfDays * lakeWeekday);
            addDetails(hotelName2, ratingOfBridge, numOfDays * bridgeWeekday);
            addDetails(hotelName3, ratingOfRidge, numOfDays * ridWeekday);
            viewDetails();
            showCheapestHotel();
            showHighestRated();
        } else if (dayType == 2) {
            addDetails(hotelName1, ratingOfLake, numOfDays * lakeWeekend);
            addDetails(hotelName2, ratingOfBridge, numOfDays * bridgeWeekend);
            addDetails(hotelName3, ratingOfRidge, numOfDays * ridWeekend);
            viewDetails();
            showCheapestHotel();
            showHighestRated();
        } else {
            System.out.println("Invalid Choice");
            return false;
        }
        return true;
    }
    public boolean getDetailsForReward(){
        System.out.println("Enter the number of Days to reserve");
        int numOfDays = scanner.nextInt();
        int lakeWeekdayForR = 80, lakeWeekendForR = 80;
        int bridgeWeekdayForR = 110, bridgeWeekendForR = 50;
        int ridWeekdayForR = 100, ridWeekendForR = 40;
        System.out.println("Enter 1 for weekday");
        System.out.println("Enter 2 for weekend");
        int dayType = scanner.nextInt();
        if (dayType == 1) {
            addDetails(hotelName1, ratingOfLake, numOfDays * lakeWeekdayForR);
            addDetails(hotelName2, ratingOfBridge, numOfDays * bridgeWeekdayForR);
            addDetails(hotelName3, ratingOfRidge, numOfDays * ridWeekdayForR);
            viewDetails();
            showCheapestHotel();
            showHighestRated();
        } else if (dayType == 2) {
            addDetails(hotelName1, ratingOfLake, numOfDays * lakeWeekendForR);
            addDetails(hotelName2, ratingOfBridge, numOfDays * bridgeWeekendForR);
            addDetails(hotelName3, ratingOfRidge, numOfDays * ridWeekendForR);
            viewDetails();
            showCheapestHotel();
            showHighestRated();
        } else {
            System.out.println("Invalid Choice");
            return false;
        }
        return true;
    }


    public void showCheapestHotel(){
        System.out.println("Cheapest Hotel: "+findCheapest());
    }
    public void showHighestRated(){
        System.out.println("Highest Rated Hotel: "+findHighestRated());
    }

    public Hotel findHighestRated() {
        Hotel rated = list
                .stream()
                .max(Comparator.comparing(Hotel::getRating))
                .orElseThrow(NoSuchFieldError::new);
        return rated;
    }

    public Hotel findCheapest() {
        Hotel cheapest = list
                .stream()
                .min(Comparator.comparing(Hotel::getPriceOfHotel))
                .orElseThrow(NoSuchFieldError::new);
        return cheapest;
    }
}
