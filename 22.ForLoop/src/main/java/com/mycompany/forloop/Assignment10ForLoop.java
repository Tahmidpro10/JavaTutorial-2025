//Find sum of 1-10 using for loop//

//----------ANSWER-----------
package com.mycompany.forloop;

public class Assignment10ForLoop {
    public static void main(String[] args) {
        int sum = 0; // Initialize sum to 0

        for (int i = 1; i <= 10; i++) {
            sum += i; // Add the current value of i to sum
        }

        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}
