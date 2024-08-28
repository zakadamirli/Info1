package Ikinci_Ay;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Welcome to the Simple Calculator!");

        do {
            System.out.println("Please choose an operation:\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit");
            System.out.println("Enter your choice:");
            String input = scanner.nextLine();

            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1-5).");
                continue;
            }

            if (number < 1 || number > 5) {
                System.out.println("Invalid choice. Please enter 1-5.");
            } else if (number == 5) {
                break;
            } else {
                System.out.print("Enter the first number: ");
                int firstNum;
                int secondNum;
                try {
                    firstNum = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the second number: ");
                    secondNum = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid numbers.");
                    continue;
                }

                switch (number) {
                    case 1:
                        System.out.println("The result is: " + (firstNum + secondNum));
                        break;
                    case 2:
                        System.out.println("The result is: " + (firstNum - secondNum));
                        break;
                    case 3:
                        System.out.println("The result is: " + firstNum * secondNum);
                        break;
                    case 4:
                        if (secondNum == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                        } else {
                            System.out.println("The result is: " + (firstNum / secondNum));
                        }
                        break;
                }
            }
        } while (true);

        System.out.println("Thank you for using the Simple Calculator!");
    }
}
