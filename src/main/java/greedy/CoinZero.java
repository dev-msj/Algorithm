package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CoinZero {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        List<Integer> coinList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            coinList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        int answer = 0;
        int indexCounter = coinList.size() - 1;
        while (k > 0) {
            int coin = coinList.get(indexCounter);

            if (coin > k) {
                indexCounter--;
                continue;
            }

            indexCounter--;
            answer += k / coin;
            k %= coin;
        }

        System.out.println(answer);
    }
}
