package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polyomino {
    public static void main(String[] args) throws IOException {
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder stringBuilder = new StringBuilder();

        boolean flag = false;
        int counter = 0;
        for (char c : input.toCharArray()) {
            if (c == 'X') {
                counter++;

                continue;
            }

            if (counter > 0) {
                int BLength = counter % 4;

                if (BLength != 0 && BLength != 2) {
                    flag = true;
                    break;
                }

                int ALength = counter / 4;

                for (int i = 0; i < ALength; i++) {
                    stringBuilder.append("AAAA");
                }

                if (BLength == 2) {
                    stringBuilder.append("BB");
                }

                counter = 0;
            }

            stringBuilder.append(".");
        }

        if (counter > 0) {
            int BLength = counter % 4;

            if (BLength != 0 && BLength != 2) {
                flag = true;
            }

            int ALength = counter / 4;

            for (int i = 0; i < ALength; i++) {
                stringBuilder.append("AAAA");
            }

            if (BLength == 2) {
                stringBuilder.append("BB");
            }
        }

        if (flag) {
            System.out.println("-1");
        } else {
            System.out.println(stringBuilder.toString());
        }
    }
}
