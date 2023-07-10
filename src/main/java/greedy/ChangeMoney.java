package greedy;

public class ChangeMoney {
    public static int solution(int change) {
        int[] changeCoin = {500, 100, 50, 10};
        int answer = 0;

        for (int i : changeCoin) {
            answer += change / i;

            change %= i;

            if (change == 0) {
                break;
            }
        }

        return answer;
    }
}
