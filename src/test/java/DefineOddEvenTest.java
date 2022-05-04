import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DefineOddEvenTest {

    @Order(1)
    @Test
    public void testDefineOddEvenHappyPathPositiveEvenNumber() {
        long number = 0;
        String expectedResult = "Even";

        DefineOddEven OddEven = new DefineOddEven();
        String actualResult = OddEven.defineOddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(2)
    @Test
    public void testDefineOddEvenHappyPathNegativeEvenNumber() {
        long number = -2;
        String expectedResult = "Even";

        DefineOddEven OddEven = new DefineOddEven();
        String actualResult = OddEven.defineOddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(3)
    @Test
    public void testDefineOddEvenHappyPathNegativeOddNumber() {
        long number = -345;
        String expectedResult = "Odd";

        DefineOddEven OddEven = new DefineOddEven();
        String actualResult = OddEven.defineOddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(4)
    @Test
    public void testDefineOddEvenHappyPathPositiveOddNumber() {
        long number = 1;
        String expectedResult = "Odd";

        DefineOddEven OddEven = new DefineOddEven();
        String actualResult = OddEven.defineOddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    //@RepeatedTest(10)
    @Test
    public void testDefineOddEvenOutOfRange() {
        long number = 2147483647L + 1;
        String expectedResult = "Undefined";

        DefineOddEven OddEven = new DefineOddEven();
        String actualResult = OddEven.defineOddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
