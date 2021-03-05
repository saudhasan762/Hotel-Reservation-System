package reserve;

import java.util.Scanner;

public class HotelReservation {


    public static void main(String[] args) {
        System.out.println("! Welcome to Hotel Management System !");
        Reservation reservation = new Reservation();
        while (true) {
            reservation.getDetails();
        }
    }
 }

