import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntersectionTest {
    @Test
    public void testIntersectionHappyPathPositive(){

        int[] ar1 = {1, 2, 4, 5, 89};
        int[] ar2 = {8, 9, 4, 2};
        int[] expectedResult = { 2, 4};

        Intersection intArray = new Intersection();
        int [] actualResult = intArray.intersectionArraysAlgorithm(ar1,ar2);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testIntersectionHappyPathPositiveNegative(){

        int[] ar3 = {1, 2, 4, 5, 8, 9};
        int[] ar4 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection intArray = new Intersection();
        int [] actualResult = intArray.intersectionArraysAlgorithm(ar3,ar4);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testIntersectionHappyPathPositiveNoIntersection(){

        int[] ar5 = {1, 2, 4, 5, 89};
        int[] ar6 = {8, 9, 45};

        int[] expectedResult = {};

        Intersection intArray = new Intersection();
        int [] actualResult = intArray.intersectionArraysAlgorithm(ar5,ar6);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testIntersectionOneEmptyNoIntersection(){

        int[] ar5 = {1, 2, 4, 5, 89};
        int[] ar6 = {};

        int[] expectedResult = {};

        Intersection intArray = new Intersection();
        int [] actualResult = intArray.intersectionArraysAlgorithm(ar5,ar6);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testIntersectionTwoEmpty(){

        int[] ar5 = {};
        int[] ar6 = {};

        int[] expectedResult = {};

        Intersection intArray = new Intersection();
        int [] actualResult = intArray.intersectionArraysAlgorithm(ar5,ar6);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testIntersectionRepElementsIntersection(){

        int[] ar5 = {1, 2, 4, 5, 89, 1};
        int[] ar6 = {1, 2, 2, 1};

        int[] expectedResult = {1, 1, 2};

        Intersection intArray = new Intersection();
        int [] actualResult = intArray.intersectionArraysAlgorithm(ar5,ar6);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }


}
