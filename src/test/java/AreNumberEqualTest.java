import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumberEqualTest {



    @Test
    public void testAreNumberTestHappyPathEqualPositive(){
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumberEqual ne = new AreNumberEqual();
        int actualResult = ne.areNumberEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testAreNumberTestHappyPathFirstLess(){
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumberEqual ne = new AreNumberEqual();
        int actualResult = ne.areNumberEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testAreNumberTestHappyPathFirstMore(){
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumberEqual ne = new AreNumberEqual();
        int actualResult = ne.areNumberEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testAreNumberTestEqualNegative(){
        int a = -89;
        int b = -89;
        int expectedResult = 0;

        AreNumberEqual ne = new AreNumberEqual();
        int actualResult = ne.areNumberEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);

    }
}
