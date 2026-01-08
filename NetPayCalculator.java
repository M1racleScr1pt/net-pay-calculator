import java.util.Scanner; // Import Scanner class for reading user input from the console

/**
 * Net Pay Calculator - COS 211 Project Author: Miracle Omokaro Date: January 2026
 * 
 * This program calculates an employee's net pay based on hours worked, hourly wage, and tax rate.
 * It demonstrates core Java fundamentals: input handling, arithmetic operations, and formatted
 * output.
 */
public class NetPayCalculator { // Public class declaration - the "Open Border" for the JVM

    // Part 2: The famous main method - the heart of every Java application
    public static void main(String[] args) { // The entry point: public static void main(String[]
                                             // args)

        // public (The Access Key): Tells the JVM, "You have permission to turn this specific key to
        // start the engine."
        // Without 'public', the JVM couldn't access this method from outside the class.

        // static (The Protocol Breaker): Great analogy! Normally, you need an object (the house)
        // to use a method (the kitchen). 'static' lets the JVM use the "kitchen" immediately
        // before the "house" is even built. No object required — direct access.

        // void (The One-Way Task): Perfect. It means the method does its job and returns nothing
        // back.
        // We're printing to console, not handing data to another method.

        // main (The ID): This is the exact name the JVM looks for. It must match the filename
        // (NetPayCalculator.java)
        // for the compiler to find and run it.

        // String[] (The Data Format): Ensures everything coming in from the command line is treated
        // as text.

        // args (The Nickname/Storage Box): Standard variable name for command-line arguments.
        // It's an array — can hold multiple pieces of data at once. We don't use it here,
        // but keeping the signature exact is mandatory.

        // Create a Scanner object to read input from the console (System.in)
        Scanner scanner = new Scanner(System.in);

        // Prompt and read hours worked
        System.out.print("Enter hours worked: ");
        double hours = scanner.nextDouble(); // nextDouble() reads a decimal number

        // Prompt and read hourly wage
        System.out.print("Enter hourly wage (₦): ");
        double wage = scanner.nextDouble();

        // Prompt and read tax rate (as decimal, e.g., 0.20 for 20%)
        System.out.print("Enter tax rate (e.g., 0.20 for 20%): ");
        double taxRate = scanner.nextDouble();

        // Core calculations
        double grossPay = hours * wage; // Total earnings before tax
        double tax = grossPay * taxRate; // Amount deducted as tax
        double netPay = grossPay - tax; // Final take-home pay

        // Display results with clean, formatted currency output
        System.out.println("\n--- Payroll Summary ---");
        System.out.printf("Gross Pay : ₦%,.2f%n", grossPay); // %, adds comma separator, .2f = 2
                                                             // decimals
        System.out.printf("Tax (%.0f%%): ₦%,.2f%n", taxRate * 100, tax); // Show tax rate as
                                                                         // percentage
        System.out.printf("Net Pay   : ₦%,.2f%n", netPay);

        // Good practice: close the scanner to free resources
        scanner.close();

        // Optional: A personal note reflecting the learning journey
        System.out.println("\nBuilt by Miracle Omokaro learning, and documenting.");
    }
}
