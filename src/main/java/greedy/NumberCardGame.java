package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberCardGame {
    public static int solution(List<List<Integer>> matrix) {
        List<Integer> answerCandidate = new ArrayList<>();
        for (List<Integer> integerList : matrix) {
            Collections.sort(integerList);

            answerCandidate.add(integerList.get(0));
        }

        Collections.sort(answerCandidate);

        return answerCandidate.get(answerCandidate.size() - 1);
    }
}
