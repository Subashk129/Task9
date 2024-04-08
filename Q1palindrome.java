package javaBasic.Task9;

import javaBasic.learning.string;

public class Q1palindrome {

    public static void main(String[] args) {
        
        String str = "Hello Java", rev= ""; // use MADAM to check Palindrome.

        System.out.println("Original string: "+ str);
            // useing for loop to reverse the string
           for(int i=str.length()-1; i>=0; i--){
           rev+=str.charAt(i);
        }
           System.out.println("Reversed String: " +rev);
           if(str.equals(rev)){

            System.out.println("This is Palindrome.");
           }

           else {
            System.out.println("This is not palindrome.");
           }
    }
}
