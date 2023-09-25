package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwoPlusOneSale {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        List<Integer> productList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            productList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        productList.sort(Comparator.reverseOrder());

        int sum = 0;
        int count = 0;
        for (int product : productList) {
            if (count == 2) {
                count = 0;
                continue;
            }

            sum += product;
            count++;
        }

        System.out.println(sum);
    }
}
