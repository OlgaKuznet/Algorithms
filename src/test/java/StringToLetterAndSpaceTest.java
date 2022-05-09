import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLetterAndSpaceTest {

    @Test
    public void testStringToLettersHappyPath() {

        String str = "hb1256uncb9999999999          99999999vdzhZOsj ,jofkfdnbvu";
        String expectedResult = "hbuncbvdzhZOsjjofkfdnbvu";

        StringToLetters stn = new StringToLetters();
        String actualResult = stn.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
