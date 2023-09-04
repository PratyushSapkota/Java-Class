package August21;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        float secondNumber = scanner.nextInt();

        System.out.println("Select an operator (+, -, /, *)");
        String operator = scanner.next();

        System.out.println("Your result is: ");
        if (operator.equals("+")){
            System.out.println(firstNumber + secondNumber);
        } else if (operator.equals("-")) {
            System.out.println(firstNumber - secondNumber);
        } else if (operator.equals("/")) {
            System.out.println(firstNumber / secondNumber);
        } else if (operator.equals("*")) {
            System.out.println(firstNumber * secondNumber);
        }else{
            System.out.println("Invalid operator selection");
        }
    }
}
