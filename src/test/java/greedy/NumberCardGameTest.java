package greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class NumberCardGameTest {
    @ParameterizedTest
    @CsvSource(value = {"3 1 2,4 1 4,2 2 2:2", "7 3 1 8,3 3 3 4:3"}, delimiter = ':')
    void testSolution(String matrixString, int expected) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (String row : matrixString.split(",")) {
            matrix.add(
                    Arrays.stream(row.split(" "))
                            .mapToInt(Integer::parseInt)
                            .boxed()
                            .collect(Collectors.toList())
            );
        }

        assertEquals(expected, NumberCardGame.solution(matrix));
    }
}