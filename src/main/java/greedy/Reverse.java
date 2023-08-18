package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static void main(String[] args) throws IOException {
        String numberString = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int counter = 0;

        char pre = numberString.charAt(0);
        for (char c : numberString.toCharArray()) {
            if (c != pre) {
                counter++;
            }

            pre = c;
        }

        if (counter % 2 == 0) {
            System.out.println(counter / 2);
        } else {
            System.out.println(counter / 2 + 1);
        }
    }
}
