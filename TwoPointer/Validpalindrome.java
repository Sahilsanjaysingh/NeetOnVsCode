package TwoPointer;

import java.util.Scanner;

public class Validpalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();

        Solution obj= new Solution();
        boolean ans =obj.Valid(str);
        System.out.println(ans);
    }
    static class Solution{
        public boolean Valid(String str){
            // clean the string 
            StringBuilder rSpace= new StringBuilder();

            for(char ch : str.toCharArray()){
                if(Character.isLetterOrDigit(ch)){
                    rSpace.append(Character.toLowerCase(ch));
                }
            }

            //convert to chr array
            char[] arr= rSpace.toString().toCharArray();


            // Reverse the array

            int i =0;
            int j=arr.length-1;

            while(i<j){
                char temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
                j--;
            }

            // Convert reversed array into string
            String reversed= new String(arr);

            //compare with cleaned original string 
            return rSpace.toString().equals(reversed);
            
            
        }

    }
}
