package StackQueues;

public class StackUsingArray {

    public int[] arr = new int[6];
    public int top = -1;

    public void printStack(){
        System.out.println("The element in the stack are :: \n");
        System.out.print("[ ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.print(" ]\n");
    }

    public void push(int ele){
       try {
           arr[++top] = ele;
           System.out.println("Pushed element : "+ele+" into the stack");
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Stack is full");
       }

    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack empty !!");
            return -1;
        }
        else{
            int p =  arr[top];
            arr[top] = 0;
            top--;
            return p;
        }
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int sizeOfStack(){
        return top + 1;
    }

}
