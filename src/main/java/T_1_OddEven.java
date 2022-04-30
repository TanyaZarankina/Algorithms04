public class T_1_OddEven {

    public String oddEven(long number) {
        if (number <= Integer.MIN_VALUE || number >= Integer.MAX_VALUE) {
            return "Undefined";
        } else {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }
    }


    public String oddEven2(long number) {
        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
            if (number % 2 == 0) {
                return "Even";
            } else {
            }
            return "Odd";
        } else {
            return "Undefined";
        }
    }
}
