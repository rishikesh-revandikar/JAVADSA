package Sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr, int n){

        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i; j < n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array :: ");
        System.out.print("[ ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ]");

    }



}
