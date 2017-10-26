package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 7, 1, 19, 4, 3, 21, 20};
        System.out.println("Before bubble sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        bubbleSort(array);
        System.out.println("After bubble sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        for (int i = 0; i < array.length -1; i++) {
            sorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
