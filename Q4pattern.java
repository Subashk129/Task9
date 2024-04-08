package javaBasic.Task9;

public class Q4pattern {

    public static void main(String[] args) {
        //loop through row
      for(int i=0; i<5; i++){
         //loop through columns
        for(int j=0; j<5; j++){

            if(i==j || i+j==5-1)
            System.out.print("*");
            else 
            System.out.print(" ");
        }
        System.out.println();
      }

    }

}
