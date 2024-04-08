package javaBasic.Task9;

import java.util.Scanner;

public class Q6hotelTariff {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // Month number of room booking
        System.out.println("Enter the Month from(1-12): ");
        int month = scanner.nextInt();
       
        // Getting rent value from user based on type of room
        System.out.println("Enter Rent Value: ");
        float rent = scanner.nextFloat();
        // Room booking days     
        System.out.println("Enter days ");
        int days = scanner.nextInt();

        hotelTariff(month, rent, days); 
        
    }
      public static void hotelTariff(int month, float rent, int days){
        float tariff = 0;
        switch(month){
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                tariff = rent * days * 20 / 100;
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
                tariff = rent * days;           
        }
            System.out.println("Hotel Tariff is: "+ String.format("%.2f",tariff));


      }


}
    


