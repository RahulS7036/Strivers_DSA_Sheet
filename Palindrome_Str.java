// Coding Ninja 
public class Solution{
    

public static boolean recursive(String str,int x,int y){

if(x>=y) return true;

if(str.charAt(x)!=str.charAt(y)) return false;

return recursive(str,x+1,y-1);

}

public static boolean isPalindrome(String str) {

int x=0,y=str.length()-1;

return recursive(str,x,y);

}

}
  ///////// Non recursive
// // public class Solution {
// //     public static boolean isPalindrome(String str) {
// //         // Write your code here.
// //         int l = str.length()-1;
// //         String s="";
// //         for(int i=l;i>=0;i--){
// //             s = s + str.charAt(i);
            
// //         }
// //         if(str.equals(s)){
// //             return true;
// //         }
// //         else{
// //             return false;
// //         }
// //     }
// // }

/////recursive
// public class Solution {
//     public static boolean isPalindrome(String str) {
//         // Write your code here.
//         int l = str.length()-1;
//         String s="";
        
//         String s1 =  swap(str, s, l);
//         if(str.equals(s1)){
//             return true;
//         }
//         else{
//             return false;
//         }
        
//     }
    
//     public static String swap(String str,String s,int l){

//         if(l < 0) return s;
//         s = s + str.charAt(l);
//         return swap(str,s,l-1);
// }

// }
