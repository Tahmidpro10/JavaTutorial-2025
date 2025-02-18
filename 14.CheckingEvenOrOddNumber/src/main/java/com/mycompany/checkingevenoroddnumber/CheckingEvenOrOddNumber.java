
package com.mycompany.checkingevenoroddnumber;

import java.util.Scanner;

public class CheckingEvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Enter any positive integer = ");
        digit = input.nextInt();
        
        if(digit%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");

        }
    }   
}
