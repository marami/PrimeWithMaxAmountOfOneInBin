package ua.com.marami;

public class PrimeNumberInBin {

    private static final int MIN_PRIME_NUMBER = 2;

    private int primeNumber = 0;
    private int amountOfOne = 0;

    public int findNumberWithMaxAmountOfOne(int maxNumber){

        if(maxNumber < MIN_PRIME_NUMBER){
            return 0;
        }

        for (int i = maxNumber; i > 1; i--){
            if(MyNumber.isPrime(i)){
                int temp = MyNumber.findAmountOfOneInBin(i);
                if (temp > amountOfOne){
                    amountOfOne = temp;
                    primeNumber = i;
                }
            }
        }

    return primeNumber;
    }

    public int getAmountOfOne(){
        return amountOfOne;
    }
}
