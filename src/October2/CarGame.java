package October2;

import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isGameRunning = true;
        System.out.println("Game is running");
        int invalidAttempts = 0 ;

        while (isGameRunning) {

            System.out.println("Enter Commands to play the game: ");
            String command = sc.next();

            if(invalidAttempts == 3){
                System.out.println("start to Start the car");
                System.out.println("stop to Stop the car");
                System.out.println("quit to Quit the game");
                invalidAttempts = 0;
            }

            if (command.equals("hint")) {
                System.out.println("start to Start the car");
                System.out.println("stop to Stop the car");
                System.out.println("quit to Quit the game");

            } else if (command.equals("quit")) {
                System.out.println("Quitting the game");
                isGameRunning = false;

            } else if (command.equals("start")) {
                System.out.println("Starting the car");

            } else if (command.equals("stop")) {
                System.out.println("Stopping the car");

            } else {
                System.out.println("Invalid command");
                invalidAttempts++;
            }

            System.out.println("_______________________________________________");
        }

    }
}
