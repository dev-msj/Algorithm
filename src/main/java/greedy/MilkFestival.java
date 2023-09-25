package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MilkFestival {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] milkMarkets = bufferedReader.readLine().split(" ");
        int count = 0;
        int nextMilk = 0;

        for (String milkStr : milkMarkets) {
            int milk = Integer.parseInt(milkStr);

            if (milk == nextMilk) {
                count++;

                if (nextMilk >= 2) {
                    nextMilk = 0;
                } else {
                    nextMilk++;
                }
            }
        }

        System.out.println(count);
    }
}
