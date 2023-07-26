package greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class InvertStringTest {
    @ParameterizedTest
    @CsvSource(value = {"0001100:1", "100110:2"}, delimiter = ':')
    void solutionTest(String numberString, int expected) {
        assertEquals(expected, InvertString.solution(numberString));
    }
}