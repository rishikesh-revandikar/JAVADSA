package Recursion;

import java.util.Scanner;

public class ReverseArray {

    public int[] arr = null;
    public int size;

    public ReverseArray(){
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

    public void reverse(int[] arr, int s, int e){
        if(s<e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            reverse(arr,s+1,e-1);
        }
    }

    public void call(){
        reverse(arr,0,this.size-1);
        System.out.println("Reversed array :: ");
        System.out.print("[ ");
        for(int i : this.arr){
            System.out.print(i+" ");
        }
        System.out.println(" ]");
    }

}
