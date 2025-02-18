
package com.mycompany.areaoftriangleandcircle;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double Radius, Area;
        System.out.println("Enter Radius = ");
        Radius = input.nextDouble();
        
        Area = 3.1416 * Radius;
        
        System.out.println("Area of Circle = "+Area);
        
    }
}
