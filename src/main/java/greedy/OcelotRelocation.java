package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OcelotRelocation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(bufferedReader.readLine());

        int[] lens = new int[inputCount];
        String[] initStates = new String[inputCount];
        String[] targetStates = new String[inputCount];

        for (int i = 0; i < inputCount; i++) {
            lens[i] = Integer.parseInt(bufferedReader.readLine());
            initStates[i] = bufferedReader.readLine();
            targetStates[i] = bufferedReader.readLine();
        }

        for (int i = 0; i < inputCount; i++) {
            int len = lens[i];
            String initState = initStates[i];
            String targetState = targetStates[i];

            int initW = 0;
            int initB = 0;
            int consecutiveState = 0;
            char pre = initState.charAt(0);
            for (int j = 0; j < len; j++) {
                char init = initState.charAt(j);
                char target = targetState.charAt(j);

                if (init == pre) {
                    consecutiveState++;
                }

                if (init != target) {
                    if (init == 'B') {
                        initB++;
                    } else {
                        initW++;
                    }
                }
            }

            if (consecutiveState - 1 == len) {
                System.out.println(Math.min(initW, initB));
            } else {
                System.out.println(Math.max(initW, initB));
            }
        }
    }
}
