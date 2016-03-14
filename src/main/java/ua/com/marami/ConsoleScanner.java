package ua.com.marami;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleScanner {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public int getInt(int start, int end) {
        int number;

        while (true) {
            while (true) {
                try {
                    number = Integer.parseInt(bufferedReader.readLine());
                } catch (NumberFormatException | IOException e) {
                    System.out.println("You should type a number from " + start + " to " + end + ": ");
                    continue;
                }
                break;
            }

            if ((number < start | number > end)) {
                System.out.println("You should type a number FROM " + start + " TO " + end + ": ");
                continue;
            } else {
                return number;
            }
        }
    }

    public int getInt(int start) {
        int end = Integer.MAX_VALUE;
        return getInt(start, end);
    }

    public void close() {
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
