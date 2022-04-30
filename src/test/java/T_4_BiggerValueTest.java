import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class T_4_BiggerValueTest {

    @Test
    public void BiggerValueTest() {
        int a = 3333;
        int b = 9999;
        int expectedResult = b;

        T_4_BiggerValue bv = new T_4_BiggerValue();
        int actualResult = bv.getBiggerValue(a, b);

        Assertions.assertEquals(expectedResult, actualResult);


    }
}
