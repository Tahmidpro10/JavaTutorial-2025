
package com.mycompany.ElseIfLadder;

import java.util.Scanner;

public class ElseIfLadder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.println("Enter any integer number: ");
        number = input.nextInt();
        
        if(number>0){
           System.out.println("Positive");
        }
        else if(number>0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal to Zero");
        }
    }
}
