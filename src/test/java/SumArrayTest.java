import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Order(1)

    @Test
    public void sumArrayHappyPathPositiveNumbers() {
        //{0, 1, 2, 3, 4, 5} → 15
        //{-7, -3} → -10
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumArrayHappyPathNegativeNumbers() {
        //{-7, -3} → -10
        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sumArrayEmptyArray() {

        int[] array = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayOnePositiveElement() {

        int[] array = {10};
        int expectedResult = 10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumArrayOneNegativeElement() {

        int[] array = {-100};
        int expectedResult = -100;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumArrayOneNegativePlusPositive() {

        int[] array = {-100, 100};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
