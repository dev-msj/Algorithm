package greedy;

public class UntilItOne {
    public static int solution(int n, int k) {
        int answer = 0;

        while (n != 1) {
            if (n % k == 0) {
                n = possibleWayTwo(n, k);
            } else {
                n = possibleWayOne(n);
            }

            answer++;
        }

        return answer;
    }

    private static int possibleWayOne(int n) {
        return n - 1;
    }

    private static int possibleWayTwo(int n, int k) {
        return n / k;
    }
}
