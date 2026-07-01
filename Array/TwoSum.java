package Array;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int t= sc.nextInt();

        Solution obj= new Solution();
        boolean ans=obj.target(arr, t);
        System.out.println(ans);
    }
    static class Solution{
        public boolean target(int arr[], int t){
            // for(int i=0; i<arr.length; i++){
            //     for(int j=i+1; j<arr.length; j++){
            //         if(arr[i]+arr[j]==t){
            //             return true;
            //         }
            //     }
            // }

            HashMap<Integer, Integer> see= new HashMap<>();
            for(int i=0; i<arr.length; i++){
                int comp= t- arr[i];
                if(see.containsKey(comp)){
                    return true;
                }
                see.put(arr[i], i);
            } 
            return false;
        }
    }
}
