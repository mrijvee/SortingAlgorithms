package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Before selection sort: ");
        int[] array = {3, 1, 5, 7, 11, 20, 2, 14};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("After selection sort: ");
        selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void selectionSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                temp = array [i];
                array[i] = array[min_index];
                array[min_index] = temp;
            }
        }
    }
}
