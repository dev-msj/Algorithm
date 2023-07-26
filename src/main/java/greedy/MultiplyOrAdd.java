package greedy;

public class MultiplyOrAdd {
    public static int solution(String numberString) {
        int answer = 0;

        for (char c : numberString.toCharArray()) {
            int number = Character.digit(c, 10);

            if (answer == 0 || answer == 1) {
                answer += number;
            } else {
                answer *= number;
            }
        }

        return answer;
    }
}
