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

    public void showCheapestHotel(){
        System.out.println("Cheapest Hotel: "+getCheapestHotel());
    }

    public Optional<Hotel> getCheapestHotel(){
       Optional<Hotel> cheapest = list.stream().min(Comparator.comparing(Hotel::getPriceOfHotel));
       return cheapest;
    }

}
