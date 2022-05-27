public class ArraySort {
    public static void ascSortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minValueIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] <= minValue) {
                    minValue = array[j];
                    minValueIndex = j;
                }
            }
            array[minValueIndex] = array[i];
            array[i] = minValue;
        }
    }

    public static void descSortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxValue = array[i];
            int maxValueIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] >= maxValue) {
                    maxValue = array[j];
                    maxValueIndex = j;
                }
            }
            array[maxValueIndex] = array[i];
            array[i] = maxValue;
        }
    }
}
