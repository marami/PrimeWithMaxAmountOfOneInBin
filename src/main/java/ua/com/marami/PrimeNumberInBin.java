package ua.com.marami;

public class PrimeNumberInBin {

    private int primeNumber = 0;
    private int amountOfOne = 0;

    public final int findNumberWithMaxAmountOfOne(int maxNumber){

        if(maxNumber < MyNumber.MIN_PRIME_NUMBER){
            System.out.println("There is no prime number less than 2");
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

    public final int getAmountOfOne(){
        return amountOfOne;
    }
}
