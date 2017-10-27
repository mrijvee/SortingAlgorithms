package insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {11, 12, 3, 14, 2, 15, 1, 9};
        insertionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void insertionSort(int[] array) {
        int current;
        for (int i = 1; i < array.length; i++) {
            current = array[i];
            int j = i-1;
            for (j = j; j >= 0 && current < array[j]; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = current;
        }
    }
}
