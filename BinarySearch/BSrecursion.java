package BinarySearch;

import java.util.ArrayList;

public class BSrecursion {

    public static int binarySearchRecursive(ArrayList<Integer> arr, int low, int high, int target){
        if(low > high) return -1;
        int mid = (low+high)/2;
        if(arr.get(mid)==target) return mid;
        else if(target > arr.get(mid)) return binarySearchRecursive(arr, mid + 1, high, target);
        return binarySearchRecursive(arr, low, mid - 1, target);

    }
}
