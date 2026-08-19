// Basilio, Andrei Kyle I.
// 1st year BSIT majoring in Web Technology
// August 18, 2026
// Project No. 4

public class AreaPerimeterRecCalc {
    public static void main(String[] args) {
        System.out.println("Welcome to Area & Perimeter Calculator!\n");
        System.out.println("You are tasked with helping a construction company estimate the materials needed to build a rectangular garden.\n" +
                "The company needs to know the area and perimeter of the garden based on its fixed dimensions.\n"); // The scenario.

        System.out.println("Given values are:\nLength = 36 meters.\nWidth = 52 meters.\n");
        System.out.println("Formula:\nArea = Length * Width\nPerimeter = 2 * (Length + width)\n");

        int length = 36; // Predefined values.
        int width = 52;

        int area = length * width; // Formula for calculating the area
        int perimeter = 2 * (length + width); // Formula for calculating the perimeter.
        System.out.println("Result: ");
        System.out.printf("The length of the garden is: %s\n", length); // The result from the values and formulas given.
        System.out.printf("The width of the garden is: %s\n", width);
        System.out.printf("The perimeter of the garden is: %s\n", perimeter);
        System.out.printf("The area of the garden is: %s\n", area);
    }
}
