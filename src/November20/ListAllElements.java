package November20;

import java.util.Scanner;

public class ListAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();

        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
