package greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ChangeMoneyTest {
    @ParameterizedTest
    @CsvSource(value = {"6:1350", "7:340", "3:560"}, delimiter = ':')
    void testExample3_1(int expected, int change) {
        assertEquals(expected, ChangeMoney.solution(change));
    }
}