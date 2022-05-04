import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValueHappyPathPositive(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testBiggerValueHappyPathNegative(){
        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testBiggerValuePositiveNegative(){
        int a = 3333;
        int b = -9999;
        int expectedResult = 3333;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testBiggerValueNegativePositive(){
        int a = -3333;
        int b = 1;
        int expectedResult = 1;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testBiggerValueEven(){
        int a = 1;
        int b = 1;
        int expectedResult = 1;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.biggerValueAlgorithm(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
