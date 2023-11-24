package Homework_november24;

public class vowelsAndConsonants {
    public static void main(String[] args) {
        String string = "Hello world";
        int vowel_count = 0;
        int consonant_count = 0;
        string = string.toLowerCase();
        for(int i = 0; i < string.length(); i++){
            switch(string.charAt(i)){
                case 'a', 'e', 'i', 'o', 'u':
                    vowel_count = vowel_count + 1;
                    break;
                case ' ':
                    break;   // to make sure empty spaces do not get counted
                default:
                    consonant_count = consonant_count + 1;
                    break;
            }
        }
        System.out.println("The number of vowels are: " + vowel_count);
        System.out.println("The number of consonant are: " + consonant_count);
    }
}
