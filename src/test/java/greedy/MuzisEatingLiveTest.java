package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MuzisEatingLiveTest {
    @Test
    void solutionTest() {
        assertEquals(1, MuzisEatingLive.solution(new int[] {3, 1, 2}, 5));
    }

    @Test
    void solutionAnswerTest() {
        assertEquals(1, MuzisEatingLive.solutionAnswer(new int[] {3, 1, 2}, 5));
        assertEquals(2, MuzisEatingLive.solutionAnswer(new int[] {8, 6, 4}, 15));
    }
}