package greedy;

import java.util.ArrayDeque;
import java.util.Queue;

public class MuzisEatingLive {
    public static int solution(int[] food_times, long k) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < k; i++) {
            int idx;
            if (i < food_times.length) {
                idx = i % food_times.length;
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
}
