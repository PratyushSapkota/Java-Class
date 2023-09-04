package August21;

import java.util.Scanner;

public class GuessingGame {

    // ask user number and compare with random
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 10: ");
        int userGuess = scanner.nextInt();

        int randomNumber = (int) (Math.random() * 11 );

        if(userGuess == randomNumber){
            System.out.println("YOU WON");
        }else{
            System.out.println("YOU LOST");
            System.out.println("The number was: " + randomNumber);
        }
    }
}
