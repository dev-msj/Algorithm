package greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoneyThatCannotCreated {
    public static int solution(String numberString) {
        List<Integer> numberList = Arrays.stream(numberString.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        if (numberList.get(0) > 1) {
            return 1;
        }

        int sum = 0;
        int preNumber = 1;
        for (int number : numberList) {
            if (preNumber == number || preNumber + 1 == number) {
                sum += number;
                preNumber = number;
                continue;
            }

            if (sum + 1 < number) {
                return sum + 1;
            }

            sum += number;
            preNumber = number;
        }

        return sum + 1;
    }
}
