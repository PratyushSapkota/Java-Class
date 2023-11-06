package FirstTermSolutions;

import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean notCorrect = true;

        while (notCorrect){
            System.out.println("Enter pin: ");
            int pin = sc.nextInt();
            if(pin == 1234){
                notCorrect = false;
                System.out.println("Correct");
            }else{
                System.out.println("Try again");
            }
        }

    }
}
