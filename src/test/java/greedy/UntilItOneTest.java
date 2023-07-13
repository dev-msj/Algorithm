package greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UntilItOneTest {
    @ParameterizedTest
    @CsvSource(value = {"25:5:2", "17:4:3"}, delimiter = ':')
    void testSolution(int n, int k, int expected) {
        assertEquals(expected, UntilItOne.solution(n, k));
    }
}