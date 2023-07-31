package greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MuzisEatingLiveTest {
//    @ParameterizedTest
//    @CsvSource(value = {"3 1 2:5:1"}, delimiter = ':')
    @Test
    void solutionTest() {
        assertEquals(1, MuzisEatingLive.solution(new int[] {3, 1, 2}, 5));
    }
}