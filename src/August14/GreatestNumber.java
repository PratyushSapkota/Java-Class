package August14;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("First number is greater");
        }else if(num1 < num2){
            System.out.println("Second number is greater");
        }else{
            System.out.println("Equal");
        }

    }
}
