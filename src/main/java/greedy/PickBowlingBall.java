package greedy;

public class PickBowlingBall {
    public static int solution(String numberString) {
        String[] numbers = numberString.split(" ");

        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!numbers[i].equals(numbers[j])) {
                    count++;
                }
            }
        }

        return count;
    }
}
