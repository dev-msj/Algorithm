package greedy;

import greedy.model.Food;

import java.util.*;

public class MuzisEatingLive {
    public static int solution(int[] food_times, long k) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            int idx;
            if (i < food_times.length) {
                idx = i;
            } else {
                if (queue.isEmpty()) {
                    break;
                }

                idx = queue.poll();
            }

            food_times[idx] -= 1;

            if (food_times[idx] > 0) {
                queue.offer(idx);
            }
        }

        if (queue.isEmpty()) {
            return -1;
        }

        return queue.poll() + 1;
    }

    public static int solutionAnswer(int[] food_times, long k) {
        Queue<Food> priorityQueue = new PriorityQueue<>();

        // 음식 시간이 적은 순으로 우선 순위 큐에 offer
        for (int i = 0; i < food_times.length; i++) {
            priorityQueue.offer(new Food(food_times[i], i));
        }

        int previousFoodTime = 0; // 음식을 먹는데 사용된 시간
        int foodCount = priorityQueue.size(); // 남은 음식의 갯수
        while (!priorityQueue.isEmpty()) {
            Food food = priorityQueue.peek();

            // 현재 음식을 다 먹기 위해 필요한 시간 = 남은 음식의 갯수 * (현재 음식의 남은 시간)
            // 현재 음식의 남은 시간 = 현재 음식 시간 - 이전 음식 시간(돌면서 음식을 먹기 때문)
            int currentFoodEatingTime = foodCount * (food.getTime() - previousFoodTime);

            // 현재 음식을 다 먹는데 걸리는 시간이 남은 k보다 클 경우
            if (currentFoodEatingTime > k) {
                break;
            }

            foodCount--; // 다 먹은 음식 제외
            k -= currentFoodEatingTime; // 현재 음식을 다 먹는데 걸린 시간을 k에서 제외
            previousFoodTime = food.getTime(); // 이전 음식 시간

            priorityQueue.poll(); // 다 먹은 음식 제거
        }

        // 남은 음식이 없다면 -1을 반환
        if (priorityQueue.isEmpty()) {
            return -1;
        }

        // 남은 음식들의 번호를 list에 저장
        List<Integer> numberList = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            numberList.add(priorityQueue.poll().getNumber());
        }

        // 남은 음식들을 번호순으로 정렬
        Collections.sort(numberList);

        // 남은 k 시간이 지난 후 먹을 음식의 번호
        return numberList.get((int) k % numberList.size()) + 1;
    }
}
