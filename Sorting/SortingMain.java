package Sorting;

import java.util.Scanner;

public class SortingMain {
    int[] arr;
    int size;

    public SortingMain(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array :: ");
        this.size = sc.nextInt();
        arr = new int[size];

        for(int i = 0; i < this.size; i++){
            System.out.print("Enter the element "+(i+1)+" :: ");
            this.arr[i]=sc.nextInt();
        }

        System.out.println("Provided array :: ");
        System.out.print("[ ");
        for(int i : this.arr){
            System.out.print(i+" ");
        }
        System.out.println(" ]");

    }

    public void callSortingFunction(int i){

        switch (i){
            case 1:
                SelectionSort.selectionSort(this.arr,this.size);
                break;
            case 2:
                BubbleSort.bubbleSort(this.arr,this.size);
                break;
            default:
                System.out.println("No such sorting");
                break;
        }

    }
}
