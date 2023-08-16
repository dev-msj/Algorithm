package materialization.upDownLeftRight;

public class UpDownLeftRight {
    public static Coordinate solution(String moveCommend, int matrixSize) {
        Coordinate coordinate = new Coordinate(1, 1, matrixSize);

        for (String commend : moveCommend.split(" ")) {
            switch (commend) {
                case "L" -> coordinate.setX(coordinate.getX() - 1);
                case "R" -> coordinate.setX(coordinate.getX() + 1);
                case "U" -> coordinate.setY(coordinate.getY() - 1);
                case "D" -> coordinate.setY(coordinate.getY() + 1);
                default -> throw new RuntimeException("잘못된 입력입니다.");
            }
        }

        return coordinate;
    }
}
