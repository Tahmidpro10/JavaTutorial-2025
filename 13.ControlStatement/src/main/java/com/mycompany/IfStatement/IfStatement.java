
package com.mycompany.IfStatement;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.println("Enter any integer number: ");
        number = input.nextInt();
        
        if(number>0){
           System.out.println("Positive");
        }
    }
}
