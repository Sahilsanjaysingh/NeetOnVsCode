package Array;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        //create array
        String[] strs= new String[n];

        //take input 
        for(int i =0; i<n; i++){
            strs[i]= sc.nextLine();
        }
        Solution obj = new Solution();
        String ans= obj.Longest(strs);
        System.out.println(ans);

    }
    static class Solution{
        public String Longest(String[] strs){
            String ans="";
            for(int i=0; i<strs[0].length(); i++){
                char ch= strs[0].charAt(i);
                for (int j=1; j<strs.length; j++){
                    if(i>=strs[j].length() || strs[j].charAt(i) != ch){
                        return ans;
                    }
                }
                ans = ans+ch;
            }
            return ans;
        }
    }
}
//  Input: strs = ["bat","bag","bank","band"]

// Output: "ba"