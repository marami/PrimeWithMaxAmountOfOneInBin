package ua.com.marami;

public class Main {

    public static final int MIN_PRIME_NUMBER = 2;

    public static void main(String[] args){

        ConsoleScanner cs = new ConsoleScanner();

        int number;

        System.out.print("Type a number: ");
        number = cs.getInt(MIN_PRIME_NUMBER);
        cs.close();

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
