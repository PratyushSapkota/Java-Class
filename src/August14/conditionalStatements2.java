package August14;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class conditionalStatements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age == 17){
            System.out.println("Welcome");
        }else{
            System.out.println("Bye");
        }
    }
}
