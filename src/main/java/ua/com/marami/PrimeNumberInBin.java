package ua.com.marami;

public class PrimeNumberInBin {

    private int primeNumber;
    private int amountOfOne;

    public final int findNumberWithMaxAmountOfOne(final int maxNumber){

        if(maxNumber < MyNumber.MIN_PRIME_NUMBER){
            return 0;
        }

        for (int i = maxNumber; i > 1; i--){
            if(MyNumber.isPrime(i)){
                final int temp = MyNumber.findAmountOfOneInBin(i);
                if (temp > amountOfOne){
                    amountOfOne = temp;
                    primeNumber = i;
                }
            }
        }

    return primeNumber;
    }

    public final int getAmountOfOne(){
        return amountOfOne;
    }
}
