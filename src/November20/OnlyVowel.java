package November20;

import java.util.Scanner;

public class OnlyVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        word = word.toLowerCase();

        for(int i = 0; i < word.length(); i++){
            switch (word.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println(word.charAt(i));
                    break;
                default:
                    break;
            }
        }
    }
}
