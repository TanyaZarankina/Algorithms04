import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class T_1_OddEvenTest {
    T_1_OddEven od;

    @Test
    public void OddEvenTest() {
        T_1_OddEven od = new T_1_OddEven();
        String actualResult, expectedResult;
        long testData;

        //-345 →  “Odd”
        expectedResult = "Odd";
        testData = -345;
        actualResult = od.oddEven(testData);
        Assertions.assertEquals(expectedResult, actualResult);


        //0 →  “Even”
        expectedResult = "Even";
        testData = 0;
        actualResult = od.oddEven(testData);
        Assertions.assertEquals(expectedResult, actualResult);

        //222222 →  “Even”
        expectedResult = "Even";
        testData = 222222L;
        actualResult = od.oddEven(testData);
        Assertions.assertEquals(expectedResult, actualResult);

        //2147483647 + 1 →  “Undefined”
        expectedResult = "Undefined";
        testData = 2147483647 + 1;
        actualResult = od.oddEven(testData);
        Assertions.assertEquals(expectedResult, actualResult);


    }

}
