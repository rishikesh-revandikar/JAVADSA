package StackQueues;

import java.util.Scanner;

public class StackQueueRunner {

    public Scanner sc = new Scanner(System.in);

    public void callStackUsingArray(){
        StackUsingArray s = new StackUsingArray();

        int choice;
        while(true){
            System.out.println("In Stack using array \n");
            System.out.println("1) push\n2) pop\n3) isEmpty\n4) size\n5) exit....\n");
            System.out.print("Enter your choice :: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    int ele;
                    System.out.print("Enter the element to push :: ");
                    ele = sc.nextInt();
                    s.push(ele);
                    s.printStack();
                    break;
                case 2:
                    int e = s.pop();
                    System.out.println("Popped element :: "+e);
                    s.printStack();
                    break;
                case 3:
                    if(s.isEmpty()) System.out.println("Stack is empty");
                    else System.out.println("stack is not empty");
                    break;
                case 4:
                    System.out.println("Number of elements in the stack are :: "+s.sizeOfStack());
                    break;
                case 5:
                    System.out.println("Exiting stack using array\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

}
