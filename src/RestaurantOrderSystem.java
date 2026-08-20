// Basilio, Andrei Kyle I.
// 1st year BSIT majoring in Web Technology
// August 20, 2026
// Project No. 6

import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Restaurant Order System!\n");
        System.out.println("\t\t  MENU CHOICES");
        System.out.println("1. Burger\t\t\t - PHP 100"); // Listed choices.
        System.out.println("2. Fries\t\t\t - PHP 50");
        System.out.println("3. Soda\t\t\t\t - PHP 30");
        System.out.println("4. Ice Cream\t\t - PHP 45");
        System.out.println("5. EXIT");

        System.out.print("\nPlease enter your choice (1 - 4): "); // Asks the customer to enter his/her choice.
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("\nYou choose Burger."); // Notify the customer about the order they choose.
                System.out.print("Enter the quantity: "); // Asks how many he/she wants.
                int qty1 = input.nextInt();
                int burgerPrice = 100 * qty1; // Formula for the total amount.
                System.out.printf("Total: PHP %d\n",  burgerPrice); // Print the total amount.
                break;
            case 2:
                System.out.println("\nYou choose Fries.");
                System.out.print("Enter the quantity: ");
                int qty2 = input.nextInt();
                int friesPrice = 50 * qty2;
                System.out.printf("Total: PHP %d\n",  friesPrice);
                break;
            case 3:
                System.out.println("\nYou choose Soda.");
                System.out.print("Enter the quantity: ");
                int qty3 = input.nextInt();
                int sodaPrice = 30 * qty3;
                System.out.printf("Total: PHP %d\n", sodaPrice);
                break;
            case 4:
                System.out.println("\nYou choose Ice Cream.");
                System.out.print("Enter the quantity: ");
                int qty4 = input.nextInt();
                int iceCreamPrice = 45 * qty4;
                System.out.printf("Total: PHP %d\n", iceCreamPrice);
                break;
            case 5:
                System.out.println("\nThank you for coming!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice."); // If the customer choose 5, they will exit the program.
                System.exit(0);
        }
        System.out.println("\nThank you for ordering!");
     input.close();
    }
}
