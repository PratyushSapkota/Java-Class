package August28;

import java.util.Scanner;

public class WeekendWeekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day: ");
        String day = scanner.next();

        switch (day) {
            case "Sunday":
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid Day");
        }

    }
}
