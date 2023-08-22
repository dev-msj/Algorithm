package materialization.up_down_left_right;

public class UpDownLeftRight {
    public static Coordinate solution(String moveCommend, int matrixSize) {
        Coordinate coordinate = new Coordinate(1, 1, matrixSize);

        for (String commend : moveCommend.split(" ")) {
            switch (commend) {
                case "L":
                    coordinate.setX(coordinate.getX() - 1);
                    break;
                case "R":
                    coordinate.setX(coordinate.getX() + 1);
                    break;
                case "U":
                    coordinate.setY(coordinate.getY() - 1);
                    break;
                case "D":
                    coordinate.setY(coordinate.getY() + 1);
                    break;
                default:
                    throw new RuntimeException("잘못된 입력입니다.");
            }
        }

        return coordinate;
    }
}
