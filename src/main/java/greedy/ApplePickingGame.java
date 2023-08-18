package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplePickingGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstInput = bufferedReader.readLine().split(" ");
        int bucketFront = 1;
        int bucketRear = Integer.parseInt(firstInput[1]);

        int appleCount = Integer.parseInt(bufferedReader.readLine());
        int moveCount = 0;

        for (int i = 0; i < appleCount; i++) {
            int applePosition = Integer.parseInt(bufferedReader.readLine());

            if (applePosition > bucketRear) {
                int move = applePosition - bucketRear;

                bucketFront += move;
                bucketRear += move;
                moveCount += move;
            } else if (applePosition < bucketFront) {
                int move = bucketFront - applePosition;

                bucketFront -= move;
                bucketRear -= move;
                moveCount += move;
            }
        }

        System.out.println(moveCount);
    }
}
