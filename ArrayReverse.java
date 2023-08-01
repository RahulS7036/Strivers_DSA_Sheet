//Reverse an Array //Coding Ninja

public class ArrayReverse {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
         int l=n-1;
        int i=0;int temp=0;
        ret(i, l, temp, nums);
       return nums;
    }
    public static int[] ret(int i,int l, int temp, int[] arr){
        if(i > l) return arr;
        temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
        return ret(i+1,l-1,temp,arr);

      }
}
