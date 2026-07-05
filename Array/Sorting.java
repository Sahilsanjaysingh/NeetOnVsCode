package Array;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        Solution obj= new Solution();
        int[] ans = obj.Sortingalgo(arr);
        
        System.out.print("soted :-" );
         for (int num : ans) {
            System.out.print(num + " ");
        }
        
    }
    static  class Solution{
        public int []Sortingalgo(int[] nums){
            //Bubble sort algo 
            for(int i=0;i<nums.length; i++){
                for(int j=0; j<nums.length-1; j++){
                    if(nums[j]> nums[j+1]){
                        int temp= nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }


                 
            return nums;
        }
    }
}
