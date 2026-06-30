package Array;

import java.util.*;
public class ContainDuplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int [n];

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        
        Solution obj = new Solution();
        boolean ans =obj.Duplicate(arr);
        System.out.print(ans);

sc.close();
    }

    static class Solution{
        public boolean  Duplicate(int nums[]){
                                         /// use Arrays.sort algo inc TC 
            // Arrays.sort(nums);
            // for(int i=0; i<nums.length; i++){
            //     if(nums[i]== nums[i+1]){
            //         return true;
            //     }
            // }
            // return false;
                            

                                    /// nested loop TC is O(n^2)
            // int n=nums.length;
            // for(int i=0; i<n; i++){
            //     for(int j=i+1; j<n; j++){
            //         if(nums[i]== nums[j]){
            //             return true;
            //         }
            //     }
            // }
            // return false;

                                    ///optimal approach 
                                    /// Hash set  Tc is O(n)
            HashSet<Integer> see= new HashSet<>();
            for(int num:nums){
                if(!see.add(num)){
                    return true;
                }
            }
            return false;
        }
    }
}
