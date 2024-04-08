package javaBasic.Task9;

import java.util.Scanner;

import javaBasic.learning.string;

public class Q2reversestring {
    
    public static void main(String[] args) {
          // string from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String input = scanner.nextLine();

        char[] inputArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = inputArray.length-1; i >=0; i--) {
            
            sb.append(inputArray[i]);
        }
        // printing in new line
        System.out.println("Reversed String: " + sb.toString());
    }

}
