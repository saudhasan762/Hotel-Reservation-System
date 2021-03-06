package reserve;

import java.util.Scanner;

public class HotelReservation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("! Welcome to Hotel Management System !");
        Reservation reservation = new Reservation();
        System.out.println("Enter 1 for Normal Customer");
        System.out.println("Enter 2 for Reward Customer");
        int choice = scanner.nextInt();
        reservation.viewDetails();
    }
 }

