package Homework_november24;

public class Palindrome {
    public static void main(String[] args) {
        String string = "pop";
        string = string.toLowerCase();
        int true_length = string.length() -1;
        boolean isPalindrome = true;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) != string.charAt(true_length - i) ){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is a palindrome: " + isPalindrome);
    }
}
