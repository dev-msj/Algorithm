package greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PickBowlingBallTest {
    @ParameterizedTest
    @CsvSource(value = {"1 3 2 3 2:8", "1 5 4 3 2 4 5 2:25"}, delimiter = ':')
    void solutionTest(String numberString, int expected) {
        assertEquals(expected, PickBowlingBall.solution(numberString));
    }
}