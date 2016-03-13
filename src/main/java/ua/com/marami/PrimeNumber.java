package ua.com.marami;

public class PrimeNumber {

    public static boolean isPrime(int number){

        if (number < 2) {
            return false;
        }
        else if (number == 2) {
            return true;
        }
        else if (number % 2 == 0) {
            return false;
        }
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static Integer findMaxPrime(int number){

        for (int i = number; i > 1; i--){
            if(isPrime(i)){
                return i;
            }
        }
        return null;
    }
}
