import org.junit.jupiter.api.Test;

public class T_7_MTest {

    @Test
    public void mTest1() {
        int a = 15;
        String expectedResult = "Good Number";

        T_7_M test = new T_7_M();
        String actualResult = test.M(a);

    }

    @Test
    public void mTest2() {
        int a = 15;
        String expectedResult = "Bad Number";

        T_7_M test = new T_7_M();
        String actualResult = test.M(a);

    }

    @Test
    public void mTest3() {
        int a = 10;
        String expectedResult = "Poor Number";

        T_7_M test = new T_7_M();
        String actualResult = test.M(a);

    }

    @Test
    public void mTest4() {
        int a = 7;
        String expectedResult = "-1";

        T_7_M test = new T_7_M();
        String actualResult = test.M(a);

    }
}
