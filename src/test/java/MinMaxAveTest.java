import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMAxAveHappyPath (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {3,7,5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAveAmoreB (){
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 6;
        int b = 2;
        int[] expectedResult = {3,7,5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAveEmptyArray (){
        int [] array = {};
        int a = 0;
        int b = 0;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAveAMoreLengthArray (){
        int [] array = {1,2,3,4,5,6,7,8};
        int a = 100;
        int b = 2;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAveBMoreLengthArray (){
        int [] array = {1,2,3,4,5,6,7,8};
        int a = 0;
        int b = 100;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAveHappyPAthPositiveNegativeArray (){
        int [] array = {1,-2,3,-4,5,-6,7,-8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {-6,7,1};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAvePositiveNegativeIndexA (){
        int [] array = {1,-2,3,-4,5,-6,7,-8};
        int a = -2;
        int b = 6;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAvePositiveNegativeIndexB (){
        int [] array = {1,-2,3,-4,5,-6,7,-8};
        int a = 2;
        int b = -6;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAveHappyPathNegativeArray (){
        int [] array = {-1,-2,-3,-4,-5,-6,-7,-8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {-7,-3,-5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testMinMAxAveEvenIndex (){
        int [] array = {-1,-2,-3,-4,-5,-6,-7,-8};
        int a = 0;
        int b = 0;
        int[] expectedResult = {-1,-1,-1};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array,a,b);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

}
