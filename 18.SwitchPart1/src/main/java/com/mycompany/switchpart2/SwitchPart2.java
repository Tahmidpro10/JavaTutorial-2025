
package com.mycompany.switchpart2;

import java.util.Scanner;

public class SwitchPart2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any number: ");
        number = input.nextInt();
        switch(number){
            case 1:
                System.out.println("One");
                break;
                
            case 2:
                System.out.println("Two");
                break;
                
            case 10:
                System.out.println("Ten");
                break;
                
            default:
                System.out.println("Not a number");
        }
    }
}
