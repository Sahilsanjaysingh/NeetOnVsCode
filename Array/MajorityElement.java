package Array;
import java.util.*;
public class MajorityElement {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]= new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
      Solution obj = new Solution();
        int ans =obj.Majority(arr);
        System.out.print(ans);
   }
   static class  Solution{
    public int Majority(int ans[]){
        // HashMap<Integer, Integer>map= new HashMap<>();
        //     for(int i=0; i<ans.length; i++){
        //         map.put(ans[i], map.getOrDefault(ans[i], 0)+1);
        //         if(map.get(ans[i])> ans.length/2 ){
        //             return ans[i];
        //         }
        //     }

        int len =ans.length/2;
        int count =0;
        int element=ans[0];
        Arrays.sort(ans);
        for(int i=0; i<ans.length; i++){
            ans[i]= element;
            count++;
            if(count >=len){
                return ans[i];
            }
        }
        return  -1;
    }
   }
    
}
