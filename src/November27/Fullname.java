package November27;

import java.util.Scanner;

public class Fullname{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = sc.next();

        System.out.println("Enter last name: ");
        String lastName = sc.next();

        System.out.println(firstName + " " + lastName);
    }
}