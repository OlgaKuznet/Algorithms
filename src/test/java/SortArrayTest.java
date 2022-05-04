import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SortArrayTest {
    @Order(1)
    @Test
    public void testSortArrayHappyPath() {

        int[] ar = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArrayAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEmpty() {

        int[] ar = {};
        int[] expectedResult = {};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArrayAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayOneElement() {

        int[] ar = {1};
        int[] expectedResult = {1};

        SortArray sa = new SortArray();
        int[] actualResult = sa.sortArrayAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
