package August21;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String SystemUsername = "pratyush";
        String SystemPassword = "pratyush";

        System.out.println("Enter Username:");
        String username = scanner.next();
        System.out.println("Enter Password:");
        String password = scanner.next();

        if(SystemPassword.equals(password) && SystemUsername.equals(username)){
            System.out.println("Logged In");
        } else if (SystemUsername.equals(username)) {
            System.out.println("Invalid Password");
        } else if (SystemPassword.equals(password)) {
            System.out.println("Invalid Username");
        }else{
            System.out.println("Invalid Username and Password");
        }
    }
}
