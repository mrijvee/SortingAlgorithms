package bubblesort;

public class TwoWayBubbleSort {

    public static void main(String[] args) {

        int[] array = {3, 7, 8, 4, 2, 9, 1};
        moveLargestNumberToBottom(array);
        System.out.print("Moving largest number to the bottom: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Moving smallest number to the top: ");
        moveSmallestNumberToTop(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void moveLargestNumberToBottom(int[] array) {
        boolean sorted = false;
        int temp;
        for (int i = 0; i < array.length - 1 && !sorted; i++) {
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

    private static void moveSmallestNumberToTop(int[] array) {
        boolean sorted = false;
        int temp;
        for (int i = 0; i < array.length - 1 && !sorted; i++) {
            sorted = true;
            for (int j = array.length - 1 - i; j > i; j--) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    sorted = false;
                }
            }
        }
    }
}