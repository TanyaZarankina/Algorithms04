public class T_2_OddIndices {

    public int[] getT_2_OddIndices(int[] array) {
        int[] newArray = new int[array.length / 2];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                newArray[i / 2] = array[i];
            }

        }
        return newArray;
    }
}
