import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----- Simple Calculator -----");
        System.out.println("Operations: + , - , * , /");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result = 0;
        boolean validOperator = true;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Result: Error - Cannot divide by zero");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Result: Error - Invalid operator");
                validOperator = false;
        }

        if (validOperator) {
            System.out.println("Result: " + result);
        }

        input.close();
    }
}
