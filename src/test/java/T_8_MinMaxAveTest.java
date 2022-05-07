import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class T_8_MinMaxAveTest {
    @Test
    public void minMaxAveHappyPathTest(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = {3, 7, 5};

        T_8_MinMaxAve minMaxAve = new T_8_MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAveAlgorithm(array, index1, index2);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void minMaxAveHappyEmptyArrayTest(){
        int[] array = {};
        int index1 = 2;
        int index2 = 6;
        int[] expectedResult = new int[]{};

        T_8_MinMaxAve minMaxAve = new T_8_MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAveAlgorithm(array, index1, index2);
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
