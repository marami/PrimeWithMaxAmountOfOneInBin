package ua.com.marami;

public class Main {

    public static void main(String[] args){

        //int number = Integer.parseInt(args[0]);
        int number2 = 333;

        int numberWithMaxAmountOfOne = 0;
        int amountOfOne = 0;

        for (int i = number2; i > 1; i--){
            if(MyNumber.isPrime(i)){
                int tempAmountOfOne = MyNumber.findAmountOfOneInBin(i);
                if (tempAmountOfOne > amountOfOne){
                    amountOfOne = tempAmountOfOne;
                    numberWithMaxAmountOfOne = i;
                }
            }
        }

        System.out.println(numberWithMaxAmountOfOne + " has " + amountOfOne + " symbols \"1\"");
    }
}
