import java.util.*;
public class shorting {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {5, 2, 6, 9, 4, 1};

        //BUBBLE SHORT                  time complexity O(n^2)
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//
//                }
//            }
//        }
//        printArray(arr);


                                 //SELECTION SHORT            time complexity= O(n^2)
            for(int i = 0; i<arr.length-1; i++){
                int smallest = i;
                for(int j = i+1; j < arr.length; j++){
                    if(arr[smallest] > arr[j]){
                        smallest = j;

                    }
                }
                //swap
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
            printArray(arr);
    }
}
