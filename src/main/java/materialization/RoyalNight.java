package materialization;

public class RoyalNight {
    public static int solution(String coordinate) {
        char x = coordinate.charAt(0);
        int y = Character.digit(coordinate.charAt(1), 10);

        int count = 0;
        int[][] moves = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
        for (int[] move : moves) {
            int moveX = x + move[0];
            int moveY = y + move[1];

            if ((moveX >= 'a' && moveX <= 'h') && (moveY >= 1 && moveY <= 8)) {
                count++;
            }
        }

        return count;
    }
}
