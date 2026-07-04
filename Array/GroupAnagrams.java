package Array;

import java.util.*;
;

public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        String str[]= new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.nextLine();
        }

        Solution  obj= new Solution() ;
        //  String ans= obj.GroupAnagrams(str);
        List<List<String>> ans = obj.GroupAnagrams(str);
         System.out.println(ans);
    }
    static class Solution{
        public List<List<String>> GroupAnagrams(String []str){
            HashMap<String,List<String>> map= new HashMap<>();
            for(int i=0; i<str.length; i++){
                String  word=str[i];
                char[] ch = word.toCharArray();
                Arrays.sort(ch);


                String key= new String(ch);
                if(!map.containsKey(key)){
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(word);
            }
            return new ArrayList<>(map.values());
        }
    }
}
