package reserve;
public class Hotel {
    public String hotelName;
    public int priceOfHotel;
    public int weekday;
    public  int weekend;

    public void setPriceOfHotel(int priceOfHotel) {
        this.priceOfHotel = priceOfHotel;
    }

    public int getWeekday() {
        return weekday;
    }

    public int getWeekend() {
        return weekend;
    }

    public Hotel(String hotelName, int weekday, int weekend, int priceOfHotel){
        this.hotelName = hotelName;
        this.priceOfHotel = priceOfHotel;
        this.weekday = weekday;
        this.weekend = weekend;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getPriceOfHotel() {
        return priceOfHotel;
    }

    public String toString(){
        return " Hotel Details [HotelName: " +hotelName+ " Weekday Price: "+weekday+ " Weekend price: "+weekend+ " Total Price: "+priceOfHotel+ ']';
    }
}
