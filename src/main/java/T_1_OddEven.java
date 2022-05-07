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
//    public String oddEven3 (int number){
//        if (number %2 !=0 && number != number *(-1)){
//            return "Odd";
//        }else if(number %2 == 0 && (number != number * (-1) || number ==0)){
//            return "Even";
//        } else {
//            return "Underfined"
//        }
//    }
}


