//Coding Ninjas problem


public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        
        int reminder = 0, count = 0;
        int num = n;
        while(n > 0){
            reminder = n % 10;
            n = n / 10;
            if(reminder == 0){
                continue;
            }
            if((num % reminder) == 0){
                count++;
            }


        }
        return count;

    }
}
