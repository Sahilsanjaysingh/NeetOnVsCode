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
// HashMap= HashMap is data Structure that stores element in key-Value pairs, where each key-values pairs, where each key is unoque and null to a value. it widely used when we need to associate one value with other.
//    Allow one null key and multiple null values
//    use pull()method to insert elements


// Hahset= is a collection that stores on;y unique element and close does not allow dullicate. it is useful when we only care about distinct values.
// allows only one null value
// Use add() methos to insert elements




// HashMap vs HashSet
//       HashMap	                                              HashSet
// Stores key-value pairs	                         Stores only unique elements
// Keys are unique, values can repeat               No duplicate elements allowed
// Allows one null key and multiple null values	 Allows only one null value
// Uses put() method	                             Uses add() method
// Implements Map interface	                     Implements Set interface
// Used for mapping data	                         Used for storing unique values
