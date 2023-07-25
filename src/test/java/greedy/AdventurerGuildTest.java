package greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdventurerGuildTest {
    @ParameterizedTest
    @CsvSource(value = {"2 3 1 2 2:2", "1 2 3 3 2 1 4:3"}, delimiter = ':')
    void testSolution(String memberStr, int expected) {
        assertEquals(expected, AdventurerGuild.solution(memberStr));
    }
}