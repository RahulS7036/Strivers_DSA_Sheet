//LeetCode 9. Palindrome_Number

class Palindrome_Number.java {
    public boolean isPalindrome(int x) {
      
        if(x < 0)
          return false;

        int n = 0;
         int y = x;
       while(x != 0){
           n = n * 10 + x % 10;
           x = x / 10;
       }

         return (y == n);
    }
}
