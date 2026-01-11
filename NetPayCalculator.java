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

public class NetPayCalculator { // public class NetPayCalculator { : Class declaration - defines a
                                // new class.

    // public: This is an access modifier. It tells the compiler that this class can be seen
    // and used by any other part of the program, or even by external tools like the
    // Java Virtual Machine - a core component that runs Java programs by translating
    // platform-independent bytecode into native machine code for any operating system,
    // enabling Java's "Write Once, Run Anywhere" (WORA) capability, managing memory (garbage
    // collection),
    // and providing a consistent runtime environment for Java and other JVM languages like Kotlin.
    // It loads, verifies, links, and executes compiled Java class files, making Java applications
    // portable - itself.

    // class: This is a keyword that tells Java you are about to define a new class,
    // which is a blueprint - a Class in Object-Oriented Programming (OOP)—a template defining
    // attributes (data) and
    // methods (behavior) to create individual objects (instances) like cars, bank accounts, or UI
    // elements for creating
    // objects that encapsulate data and behavior.

    // NetPayCalculator: This is simply the name of your class, specifically called an identifier,
    // chosen by the programmer, which in this case, is NetPayCalculator.
    // By convention, it is usually named Main if it holds the starting point of the program.
    // It should start with an uppercase letter and use CamelCase for readability.
    // it must match the filename (NetPayCalculator.java) exactly, including case sensitivity.

    // { : This is the opening brace that marks the beginning of the class body, which contains all
    // the code that defines the class's behavior and data. .

    public static void main(String[] args) { // public static void main(String[] args) { : Method
                                             // declaration — the program entry point.

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
        // ) : closes parameter list.
        // { : This is the executable part of the method — method's body starts here.

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

