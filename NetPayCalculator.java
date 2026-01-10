/**
 * Net Pay Calculator
 *
 * Personal implementation for Introduction to Programming II (COS 211). Sophomore year,
 * Cybersecurity program.
 *
 * This program reads three floating-point values from standard input, performs payroll
 * calculations, and prints formatted results to standard output.
 *
 * Design: Single class, single method. No abstraction layers. Reason: The problem is small and
 * self-contained. Extra classes would add complexity without benefit. Code should be obvious and
 * maintainable.
 *
 * Author: Miracle Omokaro GitHub: @M1racleScr1pt Date: January 2026 JDK: 25
 */
import java.util.Scanner; // import keyword: tells the compiler to include definitions from another
                          // package.
                          // java: the core Java platform package.
                          // util: sub-package containing general utility classes.
                          // Scanner: concrete class for parsing primitive types and strings from
                          // input streams.
                          // . : package separator (hierarchical access).
                          // ; : terminates the import declaration.
                          // Specific import chosen over wildcard (*) to prevent namespace pollution
                          // and improve readability.

public class NetPayCalculator { // public: access modifier — class is visible to the JVM and other
                                // classes.
                                // class: keyword declaring a new reference type.
                                // NetPayCalculator: identifier — must exactly match the source
                                // filename (case-sensitive).
                                // { : opens the class declaration block.
                                // All members (fields, methods) between this { and the matching }
                                // belong to this class.

    public static void main(String[] args) { // Method declaration — the program entry point.
                                             // public: JVM requires public access to invoke it.
                                             // static: method belongs to the class itself, not to
                                             // instances — allows invocation without object
                                             // creation.
                                             // void: return type — method returns no value.
                                             // main: exact identifier required by the JVM
                                             // specification as entry point.
                                             // ( : opens parameter list.
                                             // String[]: array type of String objects.
                                             // args: parameter name (conventional, short for
                                             // "arguments") — unused in this implementation.
                                             // ): closes parameter list.
                                             // { : opens method body.

        Scanner input = new Scanner(System.in); // Local variable declaration and initialization.
                                                // Scanner: reference type from java.util.
                                                // input: identifier (chosen for clarity).
                                                // = : assignment operator.
                                                // new: keyword that allocates an object on the heap
                                                // and invokes constructor.
                                                // Scanner(...): constructor call.
                                                // System.in: static field of System class
                                                // representing standard input stream (keyboard).
                                                // ; : terminates the statement.

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble(); // double: primitive 64-bit floating-point type (IEEE
                                           // 754).
                                           // hours: identifier.
                                           // = : assignment.
                                           // input.nextDouble(): instance method call — blocks
                                           // until valid double is entered, parses it, returns
                                           // value.
                                           // ; : end of statement.

        System.out.print("Enter hourly wage ($): ");
        double wage = input.nextDouble();

        System.out.print("Enter tax rate in percent (e.g., 20 for 20% tax): ");
        double taxRatePercent = input.nextDouble(); // User enters tax rate as whole percentage
                                                    // number (e.g., 20 for 20%).
                                                    // Stored as percent for direct display — no
                                                    // conversion needed there.

        // Convert percentage to decimal fraction for accurate calculation
        // Example: user enters 20 → taxRate = 0.20
        double taxRate = taxRatePercent / 100.0; // Division by 100.0 (double) ensures
                                                 // floating-point result.
                                                 // Reason: direct multiplication in tax calculation
                                                 // without risk of integer truncation.

        double grossPay = hours * wage; // Arithmetic expression.
                                        // * : multiplication operator.

        double taxAmount = grossPay * taxRate; // Tax calculation using decimal rate.

        double netPay = grossPay - taxAmount; // - : subtraction operator.

        System.out.println("\n--- Payroll Summary ---");

        // Formatted output using printf for precise control.
        // $ symbol used for universal console compatibility.
        // Tax rate displayed directly as whole number from user input (no decimal, no extra
        // multiplication).
        System.out.printf("Gross Pay : $%,.2f%n", grossPay);
        System.out.printf("Tax (%d%%): $%,.2f%n", (int) taxRatePercent, taxAmount); // (int) cast
                                                                                    // ensures clean
                                                                                    // whole number
                                                                                    // display
        System.out.printf("Net Pay   : $%,.2f%n", netPay);

        input.close(); // Instance method call.
                       // Closes the underlying InputStream and releases system resources.
                       // Required for good resource management, even in small programs.

    } // Closes main method body — execution ends here (implicit return to JVM)

} // Closes class body
