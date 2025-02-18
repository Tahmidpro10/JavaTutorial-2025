
package com.mycompany.unaryoperator;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int w = 10;
        int r;
       
       /* 
        r = w++; //Post-Increment
        System.out.println("r = "+r);
        
        r = w++; 
        r = w; //Result will increase +1
        System.out.println("r = "+r);
        */
       
        r = w--; //Pre-Decrement
        System.out.println("r = "+r);
        
        r = w--; 
        r = w--; //Result will decrease -2
        System.out.println("r = "+r);
    }
}
