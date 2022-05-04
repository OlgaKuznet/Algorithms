import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberHappyPathPositive(){
        int number = 555;
        boolean expectedResult = true;

        IsPositiveNumber pNumber = new IsPositiveNumber();
        boolean actualResult = pNumber.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testIsPositiveNumberHappyPathNull(){
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber pNumber = new IsPositiveNumber();
        boolean actualResult = pNumber.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testIsPositiveNumberHappyPathNegative(){
        int number = -555;
        boolean expectedResult = false;

        IsPositiveNumber pNumber = new IsPositiveNumber();
        boolean actualResult = pNumber.isPositiveNumberAlgorithm(number);

        Assertions.assertEquals(expectedResult,actualResult);


    }
}
