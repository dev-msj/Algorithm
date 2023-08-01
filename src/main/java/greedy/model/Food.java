package greedy.model;

public class Food implements Comparable<Food> {
    private final int time;
    private final int number;

    public Food(int time, int number) {
        this.time = time;
        this.number = number;
    }

    public int getTime() {
        return time;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Food o) {
        return this.time - o.time;
    }
}
