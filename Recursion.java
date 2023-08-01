//1 to N Without Loop

public class Recursion {
    public static int[] printNos(int x) {

        // Write Your Code Here
        
        int arr[] = new int[x];
       return  recursion(x, arr);

       
    }

    public static int[] recursion(int x, int[] arr){
        if(x == 0) return arr;
       arr[x-1] = x;
       return recursion(x-1, arr);


    }
}
