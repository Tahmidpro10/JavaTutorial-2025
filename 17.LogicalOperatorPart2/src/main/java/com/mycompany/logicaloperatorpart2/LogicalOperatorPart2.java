
package com.mycompany.logicaloperatorpart2;

import java.util.Scanner;

public class LogicalOperatorPart2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter: ");
        ch = input.next().charAt(0); 
        
        if(ch>='a' && ch<='z') //a-z
        {
            System.out.println("Small Letter");
        } 
        else if(ch>='A' && ch<='Z') //A-Z
        {
            System.out.println("Capital Letter");
        }else{
            System.out.println("Not a letter");
        }    
    }
}
