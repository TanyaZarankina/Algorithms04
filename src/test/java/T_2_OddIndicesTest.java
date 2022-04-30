import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class T_2_OddIndicesTest {

    @Test
    public void OddIndicesTest() {
        int[] array = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expectedResult = new int[]{590, 985, 68};

        T_2_OddIndices oi = new T_2_OddIndices();
        int[] actualResult = oi.getT_2_OddIndices(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);


    }
}
