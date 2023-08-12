//Coding Ninja
public class FrequncyCount {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.

        
        int[] arr1 = new int[n];
        for(int i = 0;i<n;i++){
         int count =0;
         for(int j=0;j<n;j++){
             if(nums[j] == i+1){
                 count++;
             }
             arr1[i] = count;
         }

        }
        return arr1;
    }
}
