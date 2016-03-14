package ua.com.marami;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleScanner {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int getInt(int minValue, int maxValue) {
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

            if ((number < minValue | number > maxValue)) {
                System.out.println("You should type a number FROM " + minValue + " TO " + maxValue + ": ");
                continue;
            } else {
                return number;
            }
        }
    }

    public int getInt(int minValue) {
        int maxValue = Integer.MAX_VALUE;
        return getInt(minValue, maxValue);
    }

    public void close() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
