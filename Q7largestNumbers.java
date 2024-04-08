package javaBasic.Task9;
import java.util.Scanner;
public class Q7largestNumbers {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int num[] = new int[3];
        int i;
         for (i=0; i<3; i++){

            System.out.println("Enter the Nubmer");

            num[i]= scanner.nextInt();

         }  

         if(num[0] > num[1] && num[0] > num[2]){

            System.out.println("The highest value is: "+ num[0]);   
         }
         else if(num[1] > num[0] && num[1] > num[2]){

            System.out.println("The highest value is: "+ num[1]);   
         }
         else if(num[2] > num[0] && num[2] > num[1]){

            System.out.println("The highest value is: "+ num[2]);
         }   
        
    }

}
