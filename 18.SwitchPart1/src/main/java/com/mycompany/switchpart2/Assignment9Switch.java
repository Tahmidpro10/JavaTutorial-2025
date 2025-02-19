// switch assignment: call center
// if user select option 1 then set language bengali
// if user select option 2 then set language hindi
// if user select option 3 then set language urdu
// for any other option set language english

// get the OPTION from user
// use switch, case, break and default

// Selected language is Bengali
// Selected language is Hindi
// Selected language is Urdu
// Selected language is English



//-------------ANSWER---------------//
package com.mycompany.switchpart2;

import java.util.Scanner;

public class Assignment9Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an option:");
        System.out.println("1. Bengali");
        System.out.println("2. Hindi");
        System.out.println("3. Urdu");
        System.out.println("Any other number for English");
        
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Selected language is Bengali");
                break;
            case 2:
                System.out.println("Selected language is Hindi");
                break;
            case 3:
                System.out.println("Selected language is Urdu");
                break;
            default:
                System.out.println("Selected language is English");
                break;
        }
    }
}
