package ua.com.marami;

public class MyNumber {

    private MyNumber(){}

    public static final int MIN_PRIME_NUMBER = 2;
    private static final int MIN_DIVIDER = 2;

    public static boolean isPrime(int number){

        if (number < MIN_PRIME_NUMBER) {
            return false;
        }

        for (int i = MIN_DIVIDER; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findAmountOfOneInBin(int number){
        int remainder;
        int amount = 0;

        while(number != 0) {
            remainder = number % 2;
            if(remainder == 1) {
                amount++;
            }
            number = number / 2;
        }

        return amount;
    }
}
