// Basilio, Andrei Kyle I.
// 1st BSIT majoring in Web Technology
// August 19, 2026
// Project No. 5

import java.util.Scanner;

public class GroceryDiscCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grocery Discount Calculator!\n");
        double overallTotal; // Declared variable used by multiple conditions.

        System.out.print("Enter the amount to calculate the grocery discount: ");
        double groceryTotal = input.nextDouble(); // Asks the user to enter the amount of grocery bought.

        if (groceryTotal < 1000) { // Program will check what condition the amount has met for the discount.
            System.out.println("\nNo discount for this amount."); // A message on what discount the user will get.
            System.out.printf("Total:  %.2f\n\n", groceryTotal); // Prints the overall total after the discount is applied.
        } else if (groceryTotal > 1000 && groceryTotal <= 5000) {
            System.out.println("\nYou have 5% discount for this amount.");
            double discount5 = groceryTotal * 0.05;
            overallTotal = groceryTotal - discount5;
            System.out.printf("Total: PHP %.2f\n\n", overallTotal);
        } else if (groceryTotal > 5000 && groceryTotal <= 10000) {
            System.out.println("\nYou have 10% discount for this amount.");
            double discount10 = groceryTotal * 0.10;
            overallTotal = groceryTotal - discount10;
            System.out.printf("Total: PHP %.2f\n\n", overallTotal);
        } else if (groceryTotal > 10000) {
            System.out.println("\nYou have 15% discount for this amount.");
            double discount15 = groceryTotal * 0.15;
            overallTotal = groceryTotal - discount15;
            System.out.printf("Total: PHP %.2f\n\n", overallTotal);
        }
        System.out.println("Enjoy your discount! ^^");
        input.close();
    }
}
