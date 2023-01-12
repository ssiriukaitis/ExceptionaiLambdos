package Dalyba;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntDividerTest {
    @Test
    public void testDivisionBetweenNineAndThree() throws ArgumentIsZeroException {
        //1. duomenys
        String pirmasSkaicius = "9";
        String antrasSkaicius = "3";
        int expectedResult = 3;
        int actualResult;

        //2. atliekant veiksmus
        String[] skaiciai = {pirmasSkaicius, antrasSkaicius};
        actualResult = IntDivider.divide(skaiciai);

        //3/ sulyginame gautus rezultatus
        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testDivision02(){

        String expected = "Sigitas";
        String actual;

        //some code

        actual = "Mano vardas yra Sigitas";

        String resultInfo = String.format(
                "Expected: %s; Actual: %s",
                expected,
                actual);

        Assert.assertTrue(resultInfo, actual.contains(expected));

    }

}