package materialization;

public class Time {
    private static final int IF_EXIST_THREE = 3600;
    private static final int IF_NOT_EXIST_THREE = 1575;

    public static int solution(int number) {
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            if (String.valueOf(i).contains("3")) {
                sum += IF_EXIST_THREE;
            } else {
                sum += IF_NOT_EXIST_THREE;
            }
        }

        return sum;
    }

    public static int solutionAnswer(int number) {
        int count = 0;

        for (int h = 0; h <= number; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    String timeString = String.format("%d%d%d", h, m, s);
                    if (timeString.contains("3")) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
