import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

    @Test
    public void testKthLargestHappyPath() {

        int[] ar = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kth = new KthLargest();
        int actualResult = kth.kThLargestAlgorithm(ar, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestKNull() {

        int[] ar = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 0;
        int expectedResult = Integer.MIN_VALUE;

        KthLargest kth = new KthLargest();
        int actualResult = kth.kThLargestAlgorithm(ar, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestKOutIfRAnge() {

        int[] ar = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 100;
        int expectedResult = Integer.MIN_VALUE;

        KthLargest kth = new KthLargest();
        int actualResult = kth.kThLargestAlgorithm(ar, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestEmptyArray() {

        int[] ar = {};
        int k = 100;
        int expectedResult = Integer.MIN_VALUE;

        KthLargest kth = new KthLargest();
        int actualResult = kth.kThLargestAlgorithm(ar, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestNegative() {

        int[] ar = {4, -3, 7, -12};
        int k = 3;
        int expectedResult = -3;

        KthLargest kth = new KthLargest();
        int actualResult = kth.kThLargestAlgorithm(ar, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
