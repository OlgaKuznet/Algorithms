import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void testReserveArrayHappyPathEvenAlements() {

        int[] ar = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testReserveArrayHappyPathOddElements() {

        int[] ar = {2, 7, 3, 10, 7};
        int[] expectedResult = {7, 10, 3, 7, 2};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testReserveArrayEmpty() {

        int[] ar = {};
        int[] expectedResult = {};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testReserveArrayNulls() {

        int[] ar = {0,0,0};
        int[] expectedResult = {0,0,0};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testReserveArrayNegative() {

        int[] ar = {-50,-40,-30,-20};
        int[] expectedResult = {-20,-30,-40,-50};

        ReverseArray ra = new ReverseArray();
        int[] actualResult = ra.reverseArrayAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
