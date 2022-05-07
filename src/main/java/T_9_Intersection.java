import java.util.ArrayList;
import java.util.Arrays;

public class T_9_Intersection {
    public int[] intersectionAlgorithm(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0) {
            return null;
        }
        int length = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    length++;
                }

            }
        }
        int[] arrayResult = new int[length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    arrayResult[count] = array1[i];
                    count++;
                }
            }
        }

        return arrayResult;
    }


}

//    public ArrayList<Integer> intersection(int[] array1, int[] array2) {
//        if (array1.length <= 0 || array2.length <= 0) {
//            return new ArrayList<>();
//        }
//        Arrays.sort(array1);
//        Arrays.sort(array2);
//        ArrayList<Integer> result = new ArrayList<>();
//        int j = 0;
//        int i = 0;
//        while (i < array1.length && j < array2.length) {
//            if (array1[i] == array2[j]) {
//                if (result.isEmpty()) {
//                    result.add(array1[i]);
//                } else if (array1[i] != result.get(result.size() - 1)) {
//                    result.add(array1[i]);
//                }
//                i++;
//                j++;
//            } else if (array1[i] > array2[j]) {
//                j++;
//            } else if (array1[i] > array2[j]) {
//                i++;
//            }
//        }
//        return result;
//    }








