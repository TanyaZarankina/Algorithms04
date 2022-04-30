public class T_7_M {

    public String M(int a) {
        if (a % 15 == 0) {
            return "Good Number";
        } else if (a % 3 == 0 && a % 5 != 0) {
            return "Bad Number";
        } else if (a % 5 == 0 && a % 3 != 0) {
            return "Poor Number";
        } else {
            return "-1";
        }
    }
}
