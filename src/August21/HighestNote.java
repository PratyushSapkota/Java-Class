package August21;

import java.util.Scanner;

public class HighestNote {
    //returns the highest cash note in the currency
    // 1000, 500, 100, 50, 20, 10, 5, 2, 1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Rs: ");
        float value = scanner.nextInt();
        float leftover, a;
        String result;

        leftover = value % 1000;
        a = value - leftover;
        result = ( (int) a / 1000) + " Thousands, ";

        value = leftover;
        leftover = value % 500;
        a = value - leftover;
        result = result + ( (int) a / 500) + " Five Hundreds, ";

        value = leftover;
        leftover = value % 100;
        a = value - leftover;
        result = result + ( (int) a / 100) + " Hundreds, ";

        value = leftover;
        leftover = value % 50;
        a = value - leftover;
        result = result + ( (int) a / 50) + " Fifties, ";

        value = leftover;
        leftover = value % 20;
        a = value - leftover;
        result = result + ( (int) a / 20) + " Twenties, ";

        value = leftover;
        leftover = value % 10;
        a = value - leftover;
        result = result + ( (int) a / 10) + " Tens, ";

        value = leftover;
        leftover = value % 5;
        a = value - leftover;
        result = result + ( (int) a / 5) + " Fives, ";

        value = leftover;
        leftover = value % 2;
        a = value - leftover;
        result = result + ( (int) a / 2) + " Twos, ";

        value = leftover;
        leftover = value % 1;
        a = value - leftover;
        result = result + ( (int) a ) + " Ones";


        System.out.println(result);

    }
}
