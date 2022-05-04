import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeOnTheRightHappyPath() {
        int [] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

        NegativeOnTheRight nOnTheR = new NegativeOnTheRight();
        int[] actualResult = nOnTheR.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testNegativeOnTheRightAllNegative() {
        int [] array = {-4, -3, -7, -12, -5};
        int[] expectedResult = {-4, -3, -7, -12, -5};

        NegativeOnTheRight nOnTheR = new NegativeOnTheRight();
        int[] actualResult = nOnTheR.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testNegativeOnTheRightAllPositive() {
        int [] array = {4, 3, 7, 12, 5};
        int[] expectedResult = {4, 3, 7, 12, 5};

        NegativeOnTheRight nOnTheR = new NegativeOnTheRight();
        int[] actualResult = nOnTheR.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testNegativeOnTheRightEmpty() {
        int [] array = {};
        int[] expectedResult = {};

        NegativeOnTheRight nOnTheR = new NegativeOnTheRight();
        int[] actualResult = nOnTheR.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testNegativeOnTheRightNullElem() {
        int [] array = {0,0,0,0,0};
        int[] expectedResult = {0,0,0,0,0};

        NegativeOnTheRight nOnTheR = new NegativeOnTheRight();
        int[] actualResult = nOnTheR.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
}
