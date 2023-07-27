package greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MoneyThatCannotCreatedTest {
    @ParameterizedTest
    @CsvSource(value = {"3 2 1 1 9:8", "5 6 7:1", "3 2 1 7 15:14", "3 2 1 7 7:21"}, delimiter = ':')
    void solutionTest(String numberString, int expected) {
        assertEquals(expected, MoneyThatCannotCreated.solution(numberString));
    }
}