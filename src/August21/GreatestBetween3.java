package August21;

import java.util.Scanner;

public class GreatestBetween3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = scanner.nextInt();


        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the greatest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest number");
        }else if (num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the greatest number");
        }else{
            System.out.println("Invalid numbers");
        }
    }
}
