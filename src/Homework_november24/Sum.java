package Homework_november24;

public class Sum {
    public static void main(String[] args) {
        String number = "11122";
        int count = 0;

        for(int i = 0; i < number.length(); i++){
            count = count + Character.getNumericValue(number.charAt(i));
        }

        System.out.println("The sum is " + count);

    }
}
