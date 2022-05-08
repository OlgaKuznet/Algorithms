import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {

    @Test
    public void testStringToNumberHappyPath(){

         String str = "1,2,3,4,5";
         int [] expectedResult = {1, 2, 3, 4, 5};

         StringToNumbers stn = new StringToNumbers();
         int [] actualResult = stn.stringToNumberAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }
    @Test
    public void testStringToplusLetter(){

        String str = "1,fg fdb2,nh  n3,4nhnh,5";
        int [] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers stn = new StringToNumbers();
        int [] actualResult = stn.stringToNumberAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

}
