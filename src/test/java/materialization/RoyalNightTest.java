package materialization;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RoyalNightTest {
    @ParameterizedTest
    @CsvSource(value = {"a1:2", "c2:6"}, delimiter = ':')
    void solutionTest(String coordinate, int expected) {
        assertEquals(expected, RoyalNight.solution(coordinate));
    }
}