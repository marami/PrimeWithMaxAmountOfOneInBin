package ua.com.marami;

public class Main {

    public static final int MIN_PRIME_NUMBER = 2;

    public static void main(String[] args){
        int number = askNumber();

        PrimeNumberInBin pn = new PrimeNumberInBin();
        int primeNumberWithMaxAmountOfOne = pn.findNumberWithMaxAmountOfOne(number);

        System.out.println(primeNumberWithMaxAmountOfOne + " has " + pn.getAmountOfOne() + " symbols \"1\"");
    }

    public static int askNumber(){
        ConsoleScanner cs = new ConsoleScanner();
        int number;

        System.out.print("Type a number: ");
        number = cs.getInt(MIN_PRIME_NUMBER);
        cs.close();
        return number;
    }
}
