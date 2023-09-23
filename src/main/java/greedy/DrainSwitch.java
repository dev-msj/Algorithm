package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrainSwitch {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        char[] inputs = input.toCharArray();
        char first = inputs[0];
        int count = 0;

        for (int i = 2; i <= inputs.length; i++) {
            if (first != inputs[i - 1]) {
                for (int j = i; j <= inputs.length; j+= i) {
                    inputs[j - 1] = inputs[j - 1] == 'Y' ? 'N' : 'Y';
                }

                count++;
            }

        }

        if (first == 'Y') {
            count++;
        }

        System.out.println(count);
    }
}
