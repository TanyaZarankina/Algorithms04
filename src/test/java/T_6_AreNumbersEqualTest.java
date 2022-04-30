import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class T_6_AreNumbersEqualTest {

    @Test

    public void NumbersEqualTest() {
        int num1 = 89;
        int num2 = 89;
        int expectedResult = 0;

        T_6_AreNumbersEqual ne = new T_6_AreNumbersEqual();
        int actualResult = ne.AreNumbersEqual(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test

    public void NumbersLessTest() {
        int num1 = -89;
        int num2 = 89;
        int expectedResult = -1;

        T_6_AreNumbersEqual ne = new T_6_AreNumbersEqual();
        int actualResult = ne.AreNumbersEqual(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test

    public void NumbersGreaterTest() {
        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;

        T_6_AreNumbersEqual ne = new T_6_AreNumbersEqual();
        int actualResult = ne.AreNumbersEqual(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);

    }
}
