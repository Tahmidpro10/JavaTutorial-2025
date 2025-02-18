
package com.mycompany.arithmeticoperator;
import java.util.Scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int digit1, digit2, result;
        
        digit1 = 2;
        digit2 = 6;
        
        System.out.println("Enter your first digit: ");
        digit1 = input.nextInt();
        
        System.out.println("Enter your second digit: ");
        digit2 = input.nextInt();
        
        result = digit1 + digit2;
        System.out.println("Sum = " +result);
        
        result = digit1 - digit2;
        System.out.println("Sub = " +result);
        
        result = digit1 * digit2;
        System.out.println("Mul = " +result);
        
        double result2 = (double) digit1/digit2;
        System.out.println("Div = " +result2);
        
        result = digit1 % digit2;
        System.out.println("Remain = " +result);
    }
}
