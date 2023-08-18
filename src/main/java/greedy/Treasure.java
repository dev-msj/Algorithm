package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Treasure {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer arrayAStringToken = new StringTokenizer(bufferedReader.readLine());
        StringTokenizer arrayBStringToken = new StringTokenizer(bufferedReader.readLine());

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        while (arrayAStringToken.hasMoreTokens()) {
            listA.add(Integer.parseInt(arrayAStringToken.nextToken()));
        }

        while (arrayBStringToken.hasMoreTokens()) {
            listB.add(Integer.parseInt(arrayBStringToken.nextToken()));
        }

        Collections.sort(listA);
        listB.sort(Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += listA.get(i) * listB.get(i);
        }

        System.out.println(sum);
    }
}
