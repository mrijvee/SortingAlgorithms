package selectionsort;

public class TwoWaySelectionSort {

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 7, 20, 3, 14};
        moveMaxNumberToBottom(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //moving the maximum number to the bottom of the sub-array
    private static void moveMaxNumberToBottom(int[] array) {
        int temp;
        for (int i = array.length -1; i > 0; i--) {
            int max_index = i;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[max_index]) {
                    max_index = j;
                }
            }
            if (max_index != i) {
                temp = array[i];
                array[i] = array[max_index];
                array[max_index] = temp;
            }
        }
    }

    //moving the minimum number to the top of the sub-array
    private static void moveMinNumberToTop(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                temp = array[i];
                array[i] = array[min_index];
                array[min_index] = temp;
            }
        }
    }
}