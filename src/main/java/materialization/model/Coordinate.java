package materialization.model;

import java.util.Objects;

public class Coordinate {
    private int x;
    private int y;
    private final int matrixSize;

    public Coordinate(int x, int y, int matrixSize) {
        this.x = x;
        this.y = y;
        this.matrixSize = matrixSize;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (isMatrixSize(x)) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (isMatrixSize(y)) {
            this.y = y;
        }
    }

    private boolean isMatrixSize(int data) {
        return data > 0 && data <= matrixSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return getX() == that.getX() && getY() == that.getY() && matrixSize == that.matrixSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), matrixSize);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                ", matrixSize=" + matrixSize +
                '}';
    }
}
