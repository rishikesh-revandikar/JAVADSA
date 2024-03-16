package Recursion;

public class Printntimes {
    public static int count = 0;

    public static void print(){
        if(count==3)
            return;
        System.out.println(count);
        count++;
        print();
    }
}
