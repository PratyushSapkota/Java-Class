package November20;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();

        for(int i = word.length() -1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
