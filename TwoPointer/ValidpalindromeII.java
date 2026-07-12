package TwoPointer;

import java.util.Scanner;

public class ValidpalindromeII {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
         String str=sc.nextLine();

        Solution obj= new Solution();
        boolean ans =obj.Valid(str);
        System.out.println(ans);

    }
    public static  class Solution{
         public boolean Valid(String str){
            // Stack<Character>st= new Stack<>();
            // // char []ans= new char[str.length()];
            // char ans[]= str.toCharArray();
            // for (char ch: ans){
            //     st.push(ch);
            // }
            // for(char ch :ans){
            //     if(ch!= st.pop()){
            //         return false;
            //     }
            // }                               //this approcah is good but not for this question becouse in this questuon i can delete at most one Character.

                                                 // two pointer 

            int left=0, right=str.length()-1;
            while(left<right){
                if(str.charAt(left) != str.charAt(right)){
                    return isPalindrome(str, left+1,right) || isPalindrome(str, left, right-1);
                }
                left++;
                right--;
            }
                return true;

         }
         private  boolean isPalindrome(String str, int left, int right ){
            while(left<right){
                if(str.charAt(left) != str.charAt(right)) return true;
                left++;
                right--;
            }
            return true;
         }
    }
}
