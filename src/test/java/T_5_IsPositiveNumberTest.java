import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class T_5_IsPositiveNumberTest {

    @Test
    public void PositiveNumberTest(){
        int num = 555;
        boolean expectedResult = true;

        T_5_IsPositiveNumber pn = new T_5_IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(num);

        Assertions.assertTrue(actualResult);

    }

    @Test
    public void ZeroNumberTest(){
        int num = 0;
        boolean expectedResult = true;

        T_5_IsPositiveNumber pn = new T_5_IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(num);

        Assertions.assertTrue(actualResult);

    }
    @Test
    public void NegativeNumberTest(){
        int num = -555;
        boolean expectedResult = true;

        T_5_IsPositiveNumber pn = new T_5_IsPositiveNumber();
        boolean actualResult = pn.IsPositiveNumber(num);

        Assertions.assertFalse(actualResult);

    }
}
