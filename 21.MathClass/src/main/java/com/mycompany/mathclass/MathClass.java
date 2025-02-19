
package com.mycompany.mathclass;

public class MathClass {

    public static void main(String[] args) {
        
        int a = 52;
        int b = 3;
        
        int max = Math.max(a, b);
        System.out.println("Maximum = "+max);
        
        int min = Math.min(a, b);
        System.out.println("Minimum = "+min);
        
        int absolute = Math.abs(a);
        System.out.println("Absolute of 'a' = "+absolute);
        
        double power = Math.pow(a, b);
        System.out.println("'a' to the power 'b' = "+power);
        
        int round = Math.round(4.2f);
        System.out.println("Round of 4.2 = "+round);
        
        double pi = Math.PI;
        System.out.println("pi = "+pi);
        
    }
}
