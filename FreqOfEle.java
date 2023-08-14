import java.util.*;
public class FreqOfEle {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.

        
        // int[] arr1 = new int[n];
        // for(int i = 0;i<n;i++){
        //  int count =0;
        //  for(int j=0;j<n;j++){
        //      if(nums[j] == i+1){
        //          count++;
        //      }
        //      arr1[i] = count;
        //  }

        // }
        // return arr1;
         int hash[]=new int[x+1];

        for(int i=0;i<n;i++)

        {

            hash[nums[i]]=hash[nums[i]]+1;

        }

        return Arrays.copyOfRange(hash, 1, n+1);

        // Write your code here.

    
    }
}
