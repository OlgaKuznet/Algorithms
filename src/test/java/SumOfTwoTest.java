import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {

    @Test
    public void testSumOfTwoHappyPath(){

        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int [][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo sot = new SumOfTwo();
        int[][] actualResult = sot.sumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult,actualResult);


    }
    @Test
    public void testSumOfTwoNoSum(){

        int [] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 100;
        int [][] expectedResult = {};

        SumOfTwo sot = new SumOfTwo();
        int[][] actualResult = sot.sumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult,actualResult);


    }
    @Test
    public void testSumOfTwoEmpty(){

        int [] array = {};
        int sum = 100;
        int [][] expectedResult = {};

        SumOfTwo sot = new SumOfTwo();
        int[][] actualResult = sot.sumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult,actualResult);


    }
}
