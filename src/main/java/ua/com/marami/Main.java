package ua.com.marami;

public class Main {

    public static void main(String[] args){

        int number = 1000;

        int numberWithMaxAmountOfOne = 0;
        int amountOfOne = 0;

        for (int i = number; i > 1; i--){
            if(MyNumber.isPrime(i)){
                int temp = MyNumber.findAmountOfOneInBin(i);
                if (temp > amountOfOne){
                    amountOfOne = temp;
                    numberWithMaxAmountOfOne = i;
                }
            }
        }

        System.out.println(numberWithMaxAmountOfOne + " has " + amountOfOne + " symbols \"1\"");
    }
}
