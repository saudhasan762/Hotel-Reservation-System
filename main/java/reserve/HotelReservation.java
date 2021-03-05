package reserve;

import java.util.Scanner;

public class HotelReservation {


    public static void main(String[] args) {
        String hotel1 = "Lakewood";
        String hotel2 = "Bridgewood";
        String hotel3 = "RidgeWood";
        int LakeWeekday = 110, LakeWeekend = 90;
        int BridWeekday = 150, BridWeekend = 50;
        int RidWeekday = 220, RidWeekend = 150;
        int ratingOfLake = 3, ratingOfBridge = 4, ratingOfRidge = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("! Welcome to Hotel Management System !");
        Reservation reservation = new Reservation();
        System.out.println("Enter 1 to view Hotels");
        System.out.println("Enter 2 to view cheapest Hotel");
        int view = scanner.nextInt();
        if (view == 1) {
            reservation.addDetails(hotel1, LakeWeekday, LakeWeekend,ratingOfLake,110);
            reservation.addDetails(hotel2, BridWeekday, BridWeekend, ratingOfBridge,160);
            reservation.addDetails(hotel3, RidWeekday, RidWeekend, ratingOfRidge,220);
            reservation.viewDetails();
        } else if (view == 2) {
            System.out.println("Enter the number of Days to reserve");
            int numOfDays = scanner.nextInt();
            System.out.println("Enter 1 for weekday");
            System.out.println("Enter 2 for weekend");
            int choice = scanner.nextInt();
            if (choice == 1) {
                reservation.addDetails(hotel1, LakeWeekday, LakeWeekend,ratingOfLake, numOfDays * LakeWeekday);
                reservation.addDetails(hotel2, BridWeekday, BridWeekend, ratingOfBridge,numOfDays * BridWeekday);
                reservation.addDetails(hotel3, RidWeekday, RidWeekend,ratingOfRidge, numOfDays * RidWeekday);
                reservation.showCheapestHotel();
            } else if (choice == 2) {
                reservation.addDetails(hotel1, LakeWeekday, LakeWeekend,ratingOfLake, numOfDays * LakeWeekend);
                reservation.addDetails(hotel2, BridWeekday, BridWeekend,ratingOfBridge, numOfDays * BridWeekend);
                reservation.addDetails(hotel3, RidWeekday, RidWeekend,ratingOfLake, numOfDays * RidWeekend);
                reservation.showCheapestHotel();
            } else
                System.out.println("Invalid Choice");
        }
    }
 }

