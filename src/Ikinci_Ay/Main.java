package Ikinci_Ay;

import java.util.Scanner;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int number = 0;

        do {
            System.out.print("Enter a non-negative integer: ");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
                if (number < 0) {
                    throw new IllegalArgumentException("Number must be non-negative.");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (!validInput);

        try {
            BigInteger factorial = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is " + factorial);
        } catch (ArithmeticException e) {
            System.out.println("Factorial calculation overflowed for " + number);
        }
    }

    private static BigInteger calculateFactorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}

