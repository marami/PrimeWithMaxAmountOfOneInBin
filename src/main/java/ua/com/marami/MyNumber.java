package ua.com.marami;

public final class MyNumber {

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
        int checkedNumber = number;
        int remainder;
        int amount = 0;

        while(checkedNumber != 0) {
            remainder = checkedNumber % 2;
            if(remainder == 1) {
                amount++;
            }
            checkedNumber = checkedNumber / 2;
        }

        return amount;
    }
}
