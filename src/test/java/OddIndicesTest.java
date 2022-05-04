import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
    //    Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    //    Test Data:
    //    Input = {-45, 590, 234, 985, 12, 68}
    //    Expected Result =  {590, 985, 68}

    @Order(1)
    @Test
    public void testOddIndicesHappyPath() {
        int [] oddIndices = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.OddIndicesAlgorithm(oddIndices);
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Order(2)
    @Test
    public void testOddIndicesEmptyArray() {
        int [] oddIndices = {};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.OddIndicesAlgorithm(oddIndices);
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Order(3)
    @Test
    public void testOddIndicesOneElement() {
        int [] oddIndices = {1};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.OddIndicesAlgorithm(oddIndices);
        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

}
