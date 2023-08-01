// Print name  n times

import java.util.List;
public class NamePrint {
    public static void printNtimes(int n){
        // Write your code here.
        if(n == 0) return;
        printNtimes(n-1);
        System.out.print("Coding Ninjas ");

        
    }
    
}
