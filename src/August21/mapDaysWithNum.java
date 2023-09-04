package August21;

import java.util.Scanner;

public class mapDaysWithNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayInput = scanner.nextInt();

        if(dayInput == 1){
            System.out.println("Sunday");
        } else if (dayInput == 2) {
            System.out.println("Monday");
        } else if (dayInput == 3) {
            System.out.println("Tuesday");
        } else if (dayInput == 4) {
            System.out.println("Wednesday");
        } else if (dayInput == 5) {
            System.out.println("Thursday");
        } else if (dayInput == 6) {
            System.out.println("Friday");
        } else if (dayInput == 7) {
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid");
        }
    }
}
