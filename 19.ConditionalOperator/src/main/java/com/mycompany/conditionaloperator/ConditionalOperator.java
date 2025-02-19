
package com.mycompany.conditionaloperator;

import java.util.Scanner;

public class ConditionalOperator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int digit1, digit2, large, small;
        System.out.println("Enter 2 digits = ");
        digit1 = input.nextInt();
        digit2 = input.nextInt();
        
        large = (digit1>digit2) ? digit1 : digit2;
        small = (digit1<digit2) ? digit1 : digit2;
        
        System.out.println("Large number = "+large);
        System.out.println("Small number = "+small);
    }
}
