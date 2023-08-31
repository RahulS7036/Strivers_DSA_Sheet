//Coding Ninja largest Element in array
import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int large = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] >= large){
                large = arr[i];
            }
        }
        return large;

    }
}
