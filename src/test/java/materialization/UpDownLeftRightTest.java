package materialization;

import materialization.model.Coordinate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpDownLeftRightTest {
    @ParameterizedTest
    @CsvSource(value = {"R R R U D D:5:3 4"}, delimiter = ':')
    void solutionTest(String moveCommend, int matrixSize, String expectedString) {
        String[] expectedStrings = expectedString.split(" ");
        Coordinate expected = new Coordinate(
                Integer.parseInt(expectedStrings[1]),
                Integer.parseInt(expectedStrings[0]),
                matrixSize
        );

        assertEquals(expected, UpDownLeftRight.solution(moveCommend, matrixSize));
    }
}