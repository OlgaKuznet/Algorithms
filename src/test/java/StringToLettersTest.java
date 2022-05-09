import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {

        @Test
        public void testStringToLettersHappyPath(){

            String str = "Ma56ma  mila34p8861!am()u";
            String expectedResult = "Mamamilapamu";

            StringToLetters stn = new StringToLetters();
            String actualResult = stn.stringToLettersAlgorithm(str);

            Assertions.assertEquals(expectedResult,actualResult);

        }
}
