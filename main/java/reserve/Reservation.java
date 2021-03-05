package reserve;

import java.util.*;

public class Reservation {
    public ArrayList<Hotel> list;
    Scanner scanner = new Scanner(System.in);

    public Reservation(){
        list = new ArrayList<>();
    }

    public void addDetails(String hotelName,int weekday, int weekend,int price) {
        Hotel hotel = new Hotel(hotelName,weekend,weekend,price);
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
