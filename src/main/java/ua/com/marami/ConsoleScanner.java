package ua.com.marami;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ConsoleScanner {

    private final Charset encoding = StandardCharsets.UTF_8;
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public final int getInt(final int minValue, final int maxValue) {
        while (true) {
            try {
                int number = Integer.parseInt(bufferedReader.readLine());
                if (number < minValue | number > maxValue) {
                    System.out.println("You should type a number FROM " + minValue + " TO " + maxValue + ": ");
                } else {
                    return number;
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("You should type a number from " + minValue + " to " + maxValue + ": ");
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
