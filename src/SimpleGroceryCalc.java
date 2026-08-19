// Basilio, Andrei Kyle I.
// 1st year BSIT majoring in Web Technology
// August 17, 2026
// Project No. 3

import java.util.Scanner;

public class SimpleGroceryCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // An interactive program that ask for the input, then calculates the overall total based on real grocery stores.
        System.out.println("Welcome to Simple Shop Calculator!\n");

        System.out.print("Enter item 1: "); // It asks the user to enter the name of the product.
        String itemName1 = input.nextLine();
        System.out.printf("Enter the price of item %s: ", itemName1);
        double price1 = input.nextDouble(); // It asks the user to enter the price of the product.
        System.out.printf("Enter the quantity of item %s: ", itemName1);
        int qty1 = input.nextInt(); // It asks the user to enter the quantity (pieces) of the product.

        input.nextLine();
        System.out.println();

        System.out.print("Enter item 2: ");
        String itemName2 = input.nextLine();
        System.out.printf("Enter the price of item %s: ", itemName2);
        double price2 = input.nextDouble();
        System.out.printf("Enter the quantity for item %s: ", itemName2);
        int qty2 = input.nextInt();

        input.nextLine();
        System.out.println();

        System.out.print("Enter item 3: ");
        String itemName3 = input.nextLine();
        System.out.printf("Enter the price of item %s: ",itemName3);
        double price3 = input.nextDouble();
        System.out.printf("Enter the quantity of item %s: ", itemName3);
        int qty3 = input.nextInt();

        System.out.println();

        double preTotal = (price1 *  qty1) + (price2 * qty2) + (price3 * qty3); // Real life formula for pre-total, discount, sales tax, and overall total.
        double discount5 = preTotal * 0.05;
        double salesTax12 = (preTotal - discount5) * 0.12;
        double overallTotal = (preTotal - discount5) + salesTax12;

        System.out.println("Total: ");
        System.out.printf("Subtotal: PHP %.2f\n", preTotal); // Prints the total of the grocery.
        System.out.printf("Discount (5%%): PHP %.2f\n", discount5);
        System.out.printf("Sales Tax (12%%): PHP %.2f\n", salesTax12);
        System.out.printf("Overall Total: PHP %.2f\n", overallTotal);
        input.close();
    }
}
