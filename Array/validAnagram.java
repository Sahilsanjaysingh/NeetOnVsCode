package Array;

import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String t= sc.next();

        Solution obj = new Solution();
        boolean ans = obj.isValid(s, t);
        System.out.println(ans);
    }

    static class Solution {
        public boolean isValid(String s, String t){
            if(s.length()  != t.length()){
                return false;
            }
            int []count =new int[26];

            for(int i=0; i<s.length(); i++){
                count[s.charAt(i)-'a']++;
                count[t.charAt(i)-'a']--;
            }

            for(int num: count){
                if(num!=0){
                    return false;
                }
            }
            return true;
        }
       
    }
}
