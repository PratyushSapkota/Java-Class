package November27;

import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = sc.next();
        firstName = firstName.toLowerCase();
        System.out.println("Enter your last name");
        String lastName = sc.next();
        lastName = lastName.toLowerCase();
        System.out.println("Enter your organization name");
        String organization = sc.next();
        organization = organization.toLowerCase();

        System.out.println("Enter your mail server [edu/com/org]: ");
        String server = sc.next();
        server = server.toLowerCase();
        switch (server) {
            case "com":
                System.out.println(firstName+"."+lastName+"@"+organization+".com");
                break;
            case "org":
                System.out.println(firstName+"."+lastName+"@"+organization+".org");
                break;
            case "edu":
                System.out.println(firstName+"."+lastName+"@"+organization+".edu");
                break;
            default:
                System.out.println("Invalid selection of mail server.");
                break;
        }


    }

}
