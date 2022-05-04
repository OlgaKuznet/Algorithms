import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhatTheNumberTest {

    @Test
    public void testWhatTheNumberTestHappyPath3and5(){
        int a = 15;
        String expectedResult = "Good Number";

        WhatTheNumber wtn = new WhatTheNumber();
        String  actualResult = wtn.whatTheNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testWhatTheNumberTestHappyPath3not5(){
        int a = 9;
        String expectedResult = "Bad Number";

        WhatTheNumber wtn = new WhatTheNumber();
        String  actualResult = wtn.whatTheNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testWhatTheNumberTestHappyPath5not3(){
        int a = 10;
        String expectedResult = "Poor Number";

        WhatTheNumber wtn = new WhatTheNumber();
        String  actualResult = wtn.whatTheNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testWhatTheNumberTestHappyPathNot5not3(){
        int a = 11;
        String expectedResult = "-1";

        WhatTheNumber wtn = new WhatTheNumber();
        String  actualResult = wtn.whatTheNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testWhatTheNumberTestNegative3(){
        int a = -9;
        String expectedResult = "Bad Number";

        WhatTheNumber wtn = new WhatTheNumber();
        String  actualResult = wtn.whatTheNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testWhatTheNumberTestNegative5(){
        int a = -10;
        String expectedResult = "Poor Number";

        WhatTheNumber wtn = new WhatTheNumber();
        String  actualResult = wtn.whatTheNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);


    }
    @Test
    public void testWhatTheNumberTestZero(){
        int a = 0;
        String expectedResult = "Good Number";

        WhatTheNumber wtn = new WhatTheNumber();
        String  actualResult = wtn.whatTheNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult,actualResult);


    }

}
