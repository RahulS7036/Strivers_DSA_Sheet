//Coding Ninja

public class Solution {
    public static int GCD(int n, int m){
      //  Write your code here.
        int small = n;
        int gcd = 0;
        if(m< n){
            small = m;
        }
        for(int i = 1;i <= small;i++ ){
            if((n % i == 0) && (m % i == 0) ){
              gcd = i;
            }
        }
        return gcd;
       
    
    }
}

//Optimized way

public class Solution {
    public static int GCD(int n, int m){
       
        if(m == 0)
            return n;
        return calcGCD(m, n%m);
    
    }
}

