package Recursion;

public class Printntimes {
    public static int count = 1;

    public static void printOneToN(int n){
        if(count>n)
            return;
        System.out.println(count);
        count++;
        printOneToN(n);
    }

    public static void printNToOne(int n){
        if(n<1)
            return;
        System.out.println(n);
        printNToOne(n-1);
    }
}
