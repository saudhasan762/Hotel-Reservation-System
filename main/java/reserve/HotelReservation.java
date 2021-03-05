package reserve;

public class HotelReservation {

    public static void main(String[] args){
        System.out.println("! Welcome to Hotel Management System !");
        System.out.println("List of hotels available :");
        Reservation reservation = new Reservation();
        reservation.addDetails("LakeWood",100);
        reservation.addDetails("Bidgewood",160);
        reservation.addDetails("Ridgewood",220);
        reservation.viewDetails();
    }
}
