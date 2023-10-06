package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingParentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String expression = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        int sum = 0;

        for (char c : expression.toCharArray()) {
            if (c == '+') {
                if (flag) {
                    sum -= Integer.parseInt(stringBuilder.toString());
                } else {
                    sum += Integer.parseInt(stringBuilder.toString());
                }

                stringBuilder.delete(0, stringBuilder.length());
            } else if (c == '-') {
                if (flag) {
                    sum -= Integer.parseInt(stringBuilder.toString());
                } else {
                    flag = true;
                    sum += Integer.parseInt(stringBuilder.toString());
                }

                stringBuilder.delete(0, stringBuilder.length());
            } else {
                stringBuilder.append(c);
            }
        }

        if (flag) {
            sum -= Integer.parseInt(stringBuilder.toString());
        } else {
            sum += Integer.parseInt(stringBuilder.toString());
        }

        System.out.println(sum);
    }

    public static void modifiedCode() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String expression = bufferedReader.readLine();
        int answer = 0;
        boolean flag = false;

        String[] splitMinus = expression.split("-");
        for (String exp : splitMinus) {
            if (exp.isEmpty()) {
                flag = true;
                continue;
            }

            int sum = 0;
            String[] splitPlus = exp.split("\\+");

            for (String num : splitPlus) {
                sum += Integer.parseInt(num);
            }

            if (!flag) {
                flag = true;
                answer += sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);
    }
}
