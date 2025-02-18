
package com.mycompany.celsiustofarenheight;

import java.util.Scanner;

public class FarenheightToCelsius {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double Farenheight, Celsius;
        
        System.out.println("Farenheight = ");
        Farenheight = input.nextDouble();
        
        Celsius = 0.5 * Farenheight + 32;
        
        System.out.println("Celsius = "+Celsius);
        
    }
}
