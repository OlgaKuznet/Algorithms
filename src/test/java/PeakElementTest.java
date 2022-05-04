import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

   @Test
    public void testPeakElementHappyPath() {

        int[] ar = {3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = {3, 7, 23};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(ar);

       Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testPeakElementNegative() {

        int[] ar = {-3, 2, -7, 5, -1, 9, -23, 1};
        int[] expectedResult = {2, 5, 9, 1};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testPeakElementEmptyArr() {

        int[] ar = {};
        int[] expectedResult = {};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testPeakElementNoPeakElement() {

        int[] ar = {3, 3, 3, 3};
        int[] expectedResult = {};

        PeakElement pe = new PeakElement();
        int[] actualResult = pe.peakElementAlgorithm(ar);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}

