//FcatOfFirtNnumbers

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
            List<Long> arr = new ArrayList<>();
           Long fact = 1L;
           int i = 2;
           while(fact <= n){
               arr.add(fact);
               fact = fact*i;
               i++;
           }
            return arr;
            }

           



    }

    //  public static long fact(long n){
    //     // Write your code here.
    //    if(n < 1) return 1;
    //    return n * fact(n-1);
        
    // }
