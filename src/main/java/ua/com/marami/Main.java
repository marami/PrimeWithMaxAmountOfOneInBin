package ua.com.marami;

public final class Main {

    private Main(){}

    public static void main(String[] args){
        int maxValue = askNumber(MyNumber.MIN_PRIME_NUMBER);

        PrimeNumberInBin pn = new PrimeNumberInBin();
        int primeNumberWithMaxAmountOfOne = pn.findNumberWithMaxAmountOfOne(maxValue);

        System.out.println(primeNumberWithMaxAmountOfOne + " has " + pn.getAmountOfOne() + " symbols \"1\"");
    }

    private static int askNumber(int minValue){
        ConsoleScanner cs = new ConsoleScanner();
        int askedNumber;

        System.out.print("Type a number: ");
        askedNumber = cs.getInt(minValue);
        cs.close();
        return askedNumber;
    }
}
