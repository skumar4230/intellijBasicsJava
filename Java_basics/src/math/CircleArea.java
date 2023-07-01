package math;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Declare variables
        double radius, area;

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from the user
        radius = input.nextDouble();

        // Calculate the area of the circle using the formula A = πr^2
        area = Math.PI * Math.pow(radius, 2);

        // Print the result
        System.out.printf("The area of the circle with radius %.2f is %.2f", radius, area);
        //The %f is a format specifier that is replaced by the corresponding variable, and the .2 specifies the number of decimal places to be displayed. So, %.2f means to display a floating-point number with two decimal places.
    }
}
