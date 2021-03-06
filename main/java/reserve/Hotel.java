package reserve;
public class Hotel {
    public String hotelName;
    public int priceOfHotel;
    public int rating;

    public void setPriceOfHotel(int priceOfHotel) {
        this.priceOfHotel = priceOfHotel;
    }

    public Hotel(String hotelName, int rating, int priceOfHotel){
        this.hotelName = hotelName;
        this.priceOfHotel = priceOfHotel;
        this.rating = rating;
    }

    public int getPriceOfHotel() {
        return priceOfHotel;
    }

    public String toString(){
        return " Hotel Details [HotelName: " +hotelName+ " Rating: "+rating+ " Price: "+priceOfHotel+ ']';
    }

    public int getRating() {
        return rating;
    }
}
