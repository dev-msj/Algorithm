package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Microwave {
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int[] buttons = {300, 60, 10};
        int[] inputCounter = {0, 0, 0};

        for (int i = 0; i < buttons.length; i++) {
            inputCounter[i] = t / buttons[i];
            t %= buttons[i];
        }

        if (t != 0) {
            System.out.println("-1");
        } else {
            System.out.printf("%d %d %d", inputCounter[0], inputCounter[1], inputCounter[2]);
        }
    }
}
