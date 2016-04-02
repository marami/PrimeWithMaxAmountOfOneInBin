package ua.com.marami;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleScanner {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public final int getInt(final int minValue, final int maxValue) {
        int number;

        while (true) {
            while (true) {
                try {
                    number = Integer.parseInt(bufferedReader.readLine());
                } catch (NumberFormatException | IOException e) {
                    System.out.println("You should type a number from " + minValue + " to " + maxValue + ": ");
                    continue;
                }
                break;
            }

            if (number < minValue | number > maxValue) {
                System.out.println("You should type a number FROM " + minValue + " TO " + maxValue + ": ");
                continue;
            } else {
                return number;
            }
        }
    }

    public final int getInt(final int minValue) {
        return getInt(minValue, Integer.MAX_VALUE);
    }

    public final void close() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
