package greedy;

import java.util.Collections;
import java.util.List;

public class LawOfLargeNumber {
    public static int solution(List<Integer> intList, int m, int k) {
        int counter = 0;
        int answer = 0;

        Collections.sort(intList);

        for (int i = 0; i < m; i++) {
            if (counter < k) {
                answer += intList.get(intList.size() - 1);
                counter++;
            } else {
                answer += intList.get(intList.size() - 2);
                counter = 0;
            }
        }

        return answer;
    }
}
