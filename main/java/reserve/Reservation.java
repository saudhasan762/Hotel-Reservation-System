package reserve;

import java.util.*;

public class Reservation {
    public ArrayList<Hotel> list;

    public Reservation(){
        list = new ArrayList<>();
    }

    public void addDetails(String hotelName,int weekday, int weekend,int rating,int price) {
        Hotel hotel =new Hotel(hotelName,weekday,weekend,rating,price);
        list.add(hotel);
    }

    public void viewDetails() {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public boolean getDetails(){
        String hotel1 = "Lakewood";
        String hotel2 = "Bridgewood";
        String hotel3 = "RidgeWood";
        int LakeWeekday = 110, LakeWeekend = 90;
        int BridWeekday = 150, BridWeekend = 50;
        int RidWeekday = 220, RidWeekend = 150;
        int ratingOfLake = 3, ratingOfBridge = 4, ratingOfRidge = 5,total = 0;
        System.out.println("Enter the number of Days to reserve");
        Scanner scanner = new Scanner(System.in);
        int numOfDays = scanner.nextInt();
        System.out.println("Enter 1 for weekday");
        System.out.println("Enter 2 for weekend");
        int choice = scanner.nextInt();
        if (choice == 1) {
            addDetails(hotel1, LakeWeekday, LakeWeekend,ratingOfLake, numOfDays * LakeWeekday);
            addDetails(hotel2, BridWeekday, BridWeekend, ratingOfBridge,numOfDays * BridWeekday);
            addDetails(hotel3, RidWeekday, RidWeekend,ratingOfRidge, numOfDays * RidWeekday);
            showCheapestHotel();
        } else if (choice == 2) {
            addDetails(hotel1, LakeWeekday, LakeWeekend,ratingOfLake, numOfDays * LakeWeekend);
            addDetails(hotel2, BridWeekday, BridWeekend,ratingOfBridge, numOfDays * BridWeekend);
            addDetails(hotel3, RidWeekday, RidWeekend,ratingOfLake, numOfDays * RidWeekend);
            showCheapestHotel();
        } else {
            System.out.println("Invalid Choice");
            return false;
        }
        return true;
    }

    public void showCheapestHotel(){
        System.out.println("Cheapest Hotel: "+getCheapestHotel());
    }

    public Optional<Hotel> getCheapestHotel(){
       Optional<Hotel> cheapest = list.stream().min(Comparator.comparing(Hotel::getPriceOfHotel));
       return cheapest;
    }

}
