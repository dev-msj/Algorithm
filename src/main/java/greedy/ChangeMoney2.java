package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeMoney2 {
    public static void main(String[] args) throws IOException {
        int[] coins = {500, 100, 50, 10, 5, 1};
        int coinCounter = 0;
        int price = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int changeMoney = 1000 - price;
        for (int coin : coins) {
            int coinCount = changeMoney / coin;
            coinCounter += coinCount;

            changeMoney %= coin;

            if (changeMoney == 0) {
                break;
            }
        }

        System.out.println(coinCounter);
    }
}
