//Coding Ninja  Sum Of First N Numbers

// public class SumOfFirstNo {
//     public static int sumFirstN(int n) {
//         // Write Your Code Here
//         int sum = 0;
//          return sumOfNo(n,sum);
//     }

//     public static int sumOfNo(int n,int sum){
//         if( n == 0) return sum;
//          sum += n;
//         return sumOfNo(n-1,sum);
         
//     }
// }

public class SumOfFirstNo {
    public static int sumFirstN(int n) {
    
    return n*(n+1)/2;
    }

    
}
