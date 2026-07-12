package Array;
import java.util.*;
public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        //input  
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
// call method from another class
Solution obj = new Solution();
int [] ans= obj.getConcatenation(arr);

//print output
for(int i=0; i<ans.length; i++){
    System.out.print(ans[i]+" ");
}

sc.close();
        
    }

static  class Solution{
        public int[] getConcatenation(int[] nums){
            int n= nums.length;
            int []ans= new int[2*n];
            for(int i=0; i<n; i++){
                ans[i]=nums[i];
                ans[i+n]= nums[i];
            }
            return ans;
        }
    }
}
