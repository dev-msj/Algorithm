package greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyOrAddTest {
    @ParameterizedTest
    @CsvSource(value = {"02984:576", "567:210"}, delimiter = ':')
    void solutionTest(String numberString, int expected) {
        assertEquals(expected, MultiplyOrAdd.solution(numberString));
    }
}