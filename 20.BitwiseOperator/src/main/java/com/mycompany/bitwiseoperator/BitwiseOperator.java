
package com.mycompany.bitwiseoperator;

public class BitwiseOperator {

    public static void main(String[] args) {
        
        int s = 90;
        int q = 8;
        int h;
        
        h = s&q;
        System.out.println("s & q = "+h);
        
        h = s|q;
        System.out.println("s | q = "+h);
        
        h = s^q;
        System.out.println("s ^ q = "+h);
        
        h = s>>q;
        System.out.println("s >> q = "+h);
        
        h = s<<q;
        System.out.println("s << q = "+h);
    }
}
