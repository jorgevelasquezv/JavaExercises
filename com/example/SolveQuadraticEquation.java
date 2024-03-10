package com.example;

import java.util.logging.Logger;
import java.util.Scanner;

/**
 * This class solves a quadratic equation and calculates its roots.
 * 
 * Input description: 3 integer values, which are the coefficients of the
 * polynomial ax2 + bx + c = 0, in the order they appear.
 * Output description: The output should be two real numbers, the two
 * solutions to the quadratic equation. It should be assumed that the values
 * exist.
 * Use the Math class method for root calculation: Math.sqrt(). The smaller root
 * should be displayed first in the output.
 * Note: Do not use conditionals (if), Use ternary operator
 * • Example input:
 * 1 -5 6
 * • Example output:
 * 2 3
 */
public class SolveQuadraticEquation {
    private static final Logger logger = Logger.getLogger(SolveQuadraticEquation.class.getName());

    /**
     * The main method of the program.
     *
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter coefficient a: ");
        int a = scanner.nextInt(); // Coefficient a of the quadratic equation

        logger.info("Enter coefficient b: ");
        int b = scanner.nextInt(); // Coefficient b of the quadratic equation

        logger.info("Enter coefficient c: ");
        int c = scanner.nextInt(); // Coefficient c of the quadratic equation

        scanner.close();

        double discriminant = calculateDiscriminant(a, b, c); // Calculate the discriminant of the quadratic equation

        // Use ternary operator to check if the discriminant is greater than or equal to
        // zero
        String result = discriminant >= 0
                ? "Root 1: " + ((-b - Math.sqrt(discriminant)) / (2 * a)) + ", Root 2: "
                        + ((-b + Math.sqrt(discriminant)) / (2 * a))
                : "The equation has no real solutions.";

        logger.info(result); // Log the roots first root and second root

    }

    /**
     * Calculates the discriminant of a quadratic equation.
     *
     * @param a Coefficient a of the quadratic equation
     * @param b Coefficient b of the quadratic equation
     * @param c Coefficient c of the quadratic equation
     * @return The discriminant of the quadratic equation
     */
    private static double calculateDiscriminant(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c; // Calculate the discriminant using the formula b^2 - 4ac
    }
}