package Recursion;

public class SumOfN {

    public static int i = 1;
    public static int sum = 0;

    public static int findSum(int n){
        if(n < 0){
            return 0;
        }
        return findSum(n-1)+n;

    }

}
