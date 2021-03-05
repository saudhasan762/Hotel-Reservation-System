package reserve;
public class Hotel {
    public String hotelName;
    public int priceOfHotel;
    public int weekday;
    public int weekend;
    public int rating;


    public Hotel(String hotelName, int weekday, int weekend,int rating, int priceOfHotel){
        this.hotelName = hotelName;
        this.priceOfHotel = priceOfHotel;
        this.weekday = weekday;
        this.weekend = weekend;
        this.rating = rating;
    }

    public int getPriceOfHotel() {
        return priceOfHotel;
    }

    public String toString(){
        return " Hotel Details [HotelName: " +hotelName+ " Rating: "+rating+ " Price: "+priceOfHotel+ ']';
    }
}
