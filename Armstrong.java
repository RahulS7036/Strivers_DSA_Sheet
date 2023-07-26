//import sun.tools.java.Scanner;
import java.util.*;
public class Armstrong {
	
	public static void main(String[] args){
		
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
     boolean flag = false;
        int dup = n;
        int length = len(n);
        int res = 0;
      
        while(n > 0){
         
           res = (int) (res + Math.pow((n % 10), length));
           n = n / 10;

        }
        if(dup == res){
           flag = true;

        }

       System.out.print(flag);
	   sc.close();
    }
     public static int len(int n){
        int count =0;
        while (n > 0){
            n = n /10;
            count++;
        }
        return count;

    }	
}
