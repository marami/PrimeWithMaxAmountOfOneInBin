package ua.com.marami;

public class MyNumber {

    public static boolean isPrime(int number){

        if (number < 2) {
            return false;
        }

        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findAmountOfOneInBin(int number){
        int b;
        int amount = 0;

        while(number != 0) {
            b = number % 2;
            if(b == 1) {
                amount++;
            }
            number = number / 2;
        }

        return amount;
    }
}
