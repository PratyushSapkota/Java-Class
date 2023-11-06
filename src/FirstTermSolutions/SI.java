package FirstTermSolutions;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        int Principal = sc.nextInt();
        System.out.println("Enter Rate: ");
        float Rate = sc.nextFloat();
        System.out.println("Enter Time: ");
        int Time = sc.nextInt();

        float SI = (Principal * Rate * Time) / 100;
        System.out.println(SI);

    }
}
