package Sorting;

public class BubbleSort {

    public static void bubbleSort(int[] arr, int n){
        for(int i = n-1; i >=1; i--){

            int isSwapped = 0;

            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=1;
                }
            }
            if(isSwapped==0){
                System.out.println("Array is already sorted");
                break;
            }
        }

        System.out.println("Sorted array :: ");
        System.out.print("[ ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(" ]");
    }
}
