
package com.mycompany.getinputfromuser;
import java.util.Scanner;

public class Assignment3Answer {
    

public class Product {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int id;
        String title;
        double price;
        String description;
        String category;

        System.out.print("Enter Product ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Product Title: ");
        title = scanner.nextLine();

        System.out.print("Enter Product Price: ");
        price = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Enter Product Description: ");
        description = scanner.nextLine();

        System.out.print("Enter Product Category: ");
        category = scanner.nextLine();

        
        System.out.println("\nProduct Details:");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);

        
        scanner.close();
    }
}
}
