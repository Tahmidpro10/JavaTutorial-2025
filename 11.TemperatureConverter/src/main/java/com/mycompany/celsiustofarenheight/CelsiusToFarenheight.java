
package com.mycompany.celsiustofarenheight;

import java.util.Scanner;

public class CelsiusToFarenheight {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double Celsius, Farenheight;
        
        System.out.println("Celsius = ");
        Celsius = input.nextDouble();
        
        Farenheight = 1.8 * Celsius + 32;
        
        System.out.println("Farenheight = "+Farenheight);
    }
}
