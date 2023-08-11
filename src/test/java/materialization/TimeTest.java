package materialization;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @DisplayName("내 풀이")
    @ParameterizedTest
    @CsvSource(value = {"5:11475"}, delimiter = ':')
    void solutionTest(int number, int expected) {
        assertEquals(expected, Time.solution(number));
    }

    @DisplayName("해설")
    @ParameterizedTest
    @CsvSource(value = {"5:11475"}, delimiter = ':')
    void solutionAnswerTest(int number, int expected) {
        assertEquals(expected, Time.solutionAnswer(number));
    }
}