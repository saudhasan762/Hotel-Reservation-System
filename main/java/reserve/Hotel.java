package reserve;

public class Hotel {
    public String hotelName;
    public int priceOfHotel;

    public Hotel(String hotelName, int priceOfHotel){
        this.hotelName = hotelName;
        this.priceOfHotel = priceOfHotel;
    }

    public String toString(){
        return " Hotel Details [HotelName: " +hotelName+ " Price: "+priceOfHotel+ ']';
    }
}
