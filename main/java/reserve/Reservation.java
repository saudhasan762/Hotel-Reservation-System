package reserve;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;

public class Reservation {
    public ArrayList<Hotel> list;

    public Reservation(){
        list = new ArrayList<>();
    }

    public void addDetails(String hotelName, int price) {
        Hotel hotel = new Hotel(hotelName, price);
        list.add(hotel);
    }

    public void viewDetails() {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Cheapest Hotel: "+getCheapestHotel());
    }

    public Optional<Hotel> getCheapestHotel(){
       Optional<Hotel> cheapest = list.stream().min(Comparator.comparing(Hotel::getPriceOfHotel));
       return cheapest;
    }

}
