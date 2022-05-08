import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOccurrencesTest {

    @Test
    public void testNumberOccurrencesHappyPath(){
        int [] array = {4, 3, 4, 12};
        int [][] expectedResult = {{3, 1}, {4, 2}, {12, 1}};

        NumberOccurrences no = new NumberOccurrences();
        int[][] actualResult = no.numberOccurancesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testNumberOccurrencesEmpty(){
        int [] array = {};
        int [][] expectedResult = {{0,0}};

        NumberOccurrences no = new NumberOccurrences();
        int[][] actualResult = no.numberOccurancesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testNumberOccurrencesAllSame(){
        int [] array = {1,1,1,1};
        int [][] expectedResult = {{1,4}};

        NumberOccurrences no = new NumberOccurrences();
        int[][] actualResult = no.numberOccurancesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testNumberOccurrencesAllDifferent(){
        int [] array = {1,2,3,4};
        int [][] expectedResult = {{1,1},{2,1},{3,1},{4,1}};

        NumberOccurrences no = new NumberOccurrences();
        int[][] actualResult = no.numberOccurancesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
