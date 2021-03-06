package reserve;

import java.util.*;

public class Reservation {
    public ArrayList<Hotel> list;
    Scanner scanner =new Scanner(System.in);
    String hotel1 = "Lakewood";
    String hotel2 = "Bridgewood";
    String hotel3 = "RidgeWood";
    int ratingOfLake = 3, ratingOfBridge = 4, ratingOfRidge = 5;

    public Reservation(){
        list = new ArrayList<>();
    }

    public void addDetails(String hotelName,int rating,int price) {
        Hotel hotel =new Hotel(hotelName,rating,price);
        list.add(hotel);
    }

    public void viewDetails() {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public boolean getDetailsForNormal() {
        int LakeWeekday = 110, LakeWeekend = 90;
        int BridWeekday = 150, BridWeekend = 50;
        int RidWeekday = 220, RidWeekend = 150;
        System.out.println("Enter the number of Days to reserve");
        int numOfDays = scanner.nextInt();
        System.out.println("Enter 1 for weekday");
        System.out.println("Enter 2 for weekend");
        int dayType = scanner.nextInt();
        if (dayType == 1) {
            addDetails(hotel1, ratingOfLake, numOfDays * LakeWeekday);
            addDetails(hotel2, ratingOfBridge, numOfDays * BridWeekday);
            addDetails(hotel3, ratingOfRidge, numOfDays * RidWeekday);
            viewDetails();
            showCheapestHotel();
            showHighestRated();
        } else if (dayType == 2) {
            addDetails(hotel1, ratingOfLake, numOfDays * LakeWeekend);
            addDetails(hotel2, ratingOfBridge, numOfDays * BridWeekend);
            addDetails(hotel3, ratingOfRidge, numOfDays * RidWeekend);
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
        int LakeWeekdayForR = 80, LakeWeekendforR = 80;
        int BridWeekdayForR = 110, BridWeekendForR = 50;
        int RidWeekdayForR = 100, RidWeekendForR = 40;
        System.out.println("Enter 1 for weekday");
        System.out.println("Enter 2 for weekend");
        int dayType = scanner.nextInt();
        if (dayType == 1) {
            addDetails(hotel1, ratingOfLake, numOfDays * LakeWeekdayForR);
            addDetails(hotel2, ratingOfBridge, numOfDays * BridWeekdayForR);
            addDetails(hotel3, ratingOfRidge, numOfDays * RidWeekdayForR);
            viewDetails();
            showCheapestHotel();
            showHighestRated();
        } else if (dayType == 2) {
            addDetails(hotel1, ratingOfLake, numOfDays * LakeWeekendforR);
            addDetails(hotel2, ratingOfBridge, numOfDays * BridWeekendForR);
            addDetails(hotel3, ratingOfRidge, numOfDays * RidWeekendForR);
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
                .max(Comparator.comparing(Hotel::getRating))
                .orElseThrow(NoSuchFieldError::new);
        return cheapest;
    }
}
