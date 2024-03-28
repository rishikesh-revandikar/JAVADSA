package BinarySearch;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class BSmain {
    ArrayList<Integer> arr = new ArrayList<>();
    int size;

    int target;
    Scanner sc = new Scanner(System.in);

    public BSmain(){
        System.out.print("Enter the number of elements in the array :: ");
        this.size = sc.nextInt();

        for(int i = 0; i < this.size; i++){
            System.out.print("Enter the element "+(i+1)+" :: ");
            int num = this.sc.nextInt();
            this.arr.add(num);
        }


        Collections.sort(arr);

        System.out.println("Sorted array :: ");
        System.out.print("[ ");
        for(int i : this.arr){
            System.out.print(i+" ");
        }
        System.out.println(" ]");

        System.out.print("Enter the target to be found :: ");
        this.target = sc.nextInt();
        System.out.println();

    }

    public void callBSFunctions(){
//        int result = BSnormal.binarySearchIterative(this.arr, this.size,this.target);
        int result = BSrecursion.binarySearchRecursive(arr, 0, size-1,target);
        if(result == -1){
            System.out.println("Target not found!!");
        }
        else{
            System.out.println("Target which is "+arr.get(result)+" at index :: "+result);
        }
    }

}
