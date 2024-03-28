package BinarySearch;

import java.util.ArrayList;

public class BSnormal {

    public static int binarySearchIterative(ArrayList<Integer> arr, int size, int target){
        int low = 0;
        int high = size - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr.get(mid)==target){
                return mid;
            } else if (target > arr.get(mid)) {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

}
