package reserve;

import java.util.ArrayList;
import java.util.Iterator;

public class Reservation {
    ArrayList<Hotel> list = new ArrayList<>();

    public void addDetails(String hotelName, int price){
        Hotel hotel = new Hotel(hotelName,price);
        list.add(hotel);
    }

    public void viewDetails(){
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
