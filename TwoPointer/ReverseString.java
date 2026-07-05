package TwoPointer;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        char arr[]= new char[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }

        Solution obj= new Solution();
        char ans[] = obj.Revers(arr);
        System.out.print(new String (ans));
    }
    static class Solution{
        public  char[]Revers(char[] nums){
//           int i=0;
//           int j=nums.length-1;
//         while(i<j){
//         char temp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=temp;
//         i++;
//         j--;
       

// /// why we use while loop ==Suppose we have:

// // Index:  0 1 2 3 4
// // Array: [h e l l o]

// // We need to swap:

// // 0 ↔ 4
// // 1 ↔ 3

// // After that, we're done. We don't want to swap the middle element.

//         }





//  using stack
        Stack<Character> st= new Stack<>();

        for(char ch:nums){
            st.push(ch);
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=st.pop();
        }
            return nums;
        }
    }
}





// | Method       | Time | Extra Space |
// | ------------ | ---- | ----------- |
// | Two Pointers | O(n) | O(1) ✅      |
// | Stack        | O(n) | O(n)        |
