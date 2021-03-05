package reserve;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HotelReservation {

    public static void main(String[] args){
        String hotel1 = "Lakewood";
        String hotel2 ="Bridgewood";
        String hotel3 = "RidgeWood";
        int LakeWeekday = 110, LakeWeekend = 90;
        int BridWeekday = 150, BridWeekend = 50;
        int RidWeekday = 220, RidWeekend = 150;

        Scanner scanner =new Scanner(System.in);
        System.out.println("! Welcome to Hotel Management System !");
        Reservation reservation = new Reservation();
        System.out.println("Enter the number of Days to reserve");
        int numOfDays = scanner.nextInt();
        System.out.println("Enter 1 for weekday");
        System.out.println("Enter 2 for weekend");
        int choice = scanner.nextInt();
        if(choice ==1) {
            reservation.addDetails(hotel1, LakeWeekday, LakeWeekend, numOfDays*LakeWeekday);
            reservation.addDetails(hotel2,BridWeekday, BridWeekend, numOfDays*BridWeekday);
            reservation.addDetails(hotel3,RidWeekday,RidWeekend,numOfDays*RidWeekday);
            reservation.viewDetails();
        }else if(choice ==2){
            reservation.addDetails(hotel1, LakeWeekday, LakeWeekend, numOfDays*LakeWeekend);
            reservation.addDetails(hotel2,BridWeekday, BridWeekend, numOfDays*BridWeekend);
            reservation.addDetails(hotel3,RidWeekday,RidWeekend,numOfDays*RidWeekend);
            reservation.viewDetails();
        }else
            System.out.println("Invalid Choice");

    }
}
