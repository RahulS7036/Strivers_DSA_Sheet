// N to 1 without loop BackTrack


public class BackTrack{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int i=0;
        int[] arr = new int[x];
        return printNtimes(i,x,arr);
    }
    
	 public static int[] printNtimes(int i,int n, int[] arr){
        // Write your code here.
        if(n == 0) return arr;
        
        arr[i] = n;
        return printNtimes(i+1, n-1,arr);
        
    }
}
