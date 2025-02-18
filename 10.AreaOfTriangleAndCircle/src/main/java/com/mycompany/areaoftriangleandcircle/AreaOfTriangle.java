
package com.mycompany.areaoftriangleandcircle;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base, height, area;
        
        //Area of Tringle//
        System.out.println("Enter Base = ");
        base = input.nextDouble();
        
        System.out.println("Enter Height = ");
        height = input.nextDouble();
        
        area = 0.5 * base * height;
        
        System.out.println("Area of Triangle = "+area);
    }
}
