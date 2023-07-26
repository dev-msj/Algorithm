package greedy;

public class InvertString {
    public static int solution(String numberString) {
        int groupZero = 0;
        int groupOne = 0;

        int preNumber = -1;
        for (char c : numberString.toCharArray()) {
            int number = Character.digit(c, 10);

            if (preNumber == -1) {
                preNumber = number;

                continue;
            }

            if (preNumber != number) {
                // 풀이하며 놓친 엣지 케이스 2
                preNumber = number;

                if (number == 1) {
                    groupZero++;
                } else {
                    groupOne++;
                }
            }
        }

        // 풀이하며 놓친 엣지 케이스 1
        if (preNumber == 0) {
            groupZero++;
        } else {
            groupOne++;
        }

        return Math.min(groupOne, groupZero);
    }
}
