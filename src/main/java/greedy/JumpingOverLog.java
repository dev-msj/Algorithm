package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JumpingOverLog {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        List<Integer> nList = new ArrayList<>();
        List<List<Integer>> liList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            nList.add(Integer.parseInt(bufferedReader.readLine()));
            liList.add(
                    Arrays.stream(bufferedReader.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .boxed()
                            .sorted()
                            .collect(Collectors.toList())
            );
        }

        for (int i = 0; i < t; i++) {
            int n = nList.get(i);
            List<Integer> li = liList.get(i);
            List<Integer> order = new ArrayList<>();
            List<Integer> reverse = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if ((j + 1) % 2 == 0) {
                    reverse.add(li.get(j));
                } else {
                    order.add(li.get(j));
                }
            }

            reverse.sort(Comparator.reverseOrder());

            order.addAll(reverse);

            int max = 0;
            for (int j = 1; j < n; j++) {
                int curr = Math.abs(order.get(j - 1) - order.get(j));

                if (curr > max) {
                    max = curr;
                }
            }

            answerList.add(max);
        }

        answerList.forEach(System.out::println);
    }
}
