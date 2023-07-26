//Coding Ninja
//Sum of all divisors



public class SumOfAllDivisors {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
       

        int sum = 0;
        for(int i = 1; i <= n; i++){
            // for( int j = 1; j<= i; j++){
            //     if(i % j == 0){
            //         res += j;
            //     }
            // }
            sum += (n/i)*i;
        }

       return sum;
    }
    
}
