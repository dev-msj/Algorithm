package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ATM {
    public static void main(String[] args) throws IOException {
        List<Integer> PList;
        int sum = 0;
        int preSum = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String Pi;

        n = Integer.parseInt(bufferedReader.readLine());
        Pi = bufferedReader.readLine();

        PList = Arrays.stream(Pi.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            preSum = preSum + PList.get(i);
            sum += preSum;
        }

        System.out.println(sum);
    }
}
