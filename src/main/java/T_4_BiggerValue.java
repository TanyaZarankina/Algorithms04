public class T_4_BiggerValue {

    public int getBiggerValue(int a, int b) {
        int max;
        if (a < b) {
            max = b;
        } else {
            max = a;
        }
        return max;
    }
}
