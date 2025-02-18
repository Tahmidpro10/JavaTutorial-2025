
package com.mycompany.getinputfromuser;
import java.util.Scanner;

public class GetInputFromUser {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int digit;
       
        /*
        System.out.println("Enter any digit = ");
        digit = input.nextInt();
        
        System.out.println("One digit number = " +digit);
        */
        
        
        //String name;
        double num1;
        System.out.println("Enter any double value = ");
        //name = input.next();//
       //name = input.nextLine();
        num1 = input.nextDouble();
        //System.out.println("Welcome : " + name);
        System.out.println("Welcome : " + num1);
    }
}
