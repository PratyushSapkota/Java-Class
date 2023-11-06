package FirstTermSolutions;

public class Sum {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 0; i<=10;i++){
            if(i%2==0){
                evenSum = evenSum + i;
            }else {
                oddSum = oddSum + i;
            }
        }

        System.out.println("Odd sum " + oddSum);
        System.out.println("Even sum " + evenSum);
    }
}
