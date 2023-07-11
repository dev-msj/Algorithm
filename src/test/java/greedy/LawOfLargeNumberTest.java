package greedy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LawOfLargeNumberTest {
    @ParameterizedTest
    @CsvSource(value = {"2 4 5 4 6:8:3:46", "3 4 3 4 3:7:2:28"}, delimiter = ':')
    void testSolution(String stringArray, int m, int k, int expected) {
        List<Integer> intList = Arrays.stream(stringArray.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        assertEquals(expected, LawOfLargeNumber.solution(intList, m, k));
    }
}