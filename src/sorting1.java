import java.util.*;

    public class sorting1 {
        public static void main(String[] args) {
            int[] arr = {5, 1, 6, 3, 9};
            bubbleSort(arr);
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }

        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;

            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j+1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                // If no two elements were swapped in the inner loop, then the array is already sorted
                if (!swapped) {
                    break;
                }
            }
        }
    }

