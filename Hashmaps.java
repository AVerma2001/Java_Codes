import java.util.*;
public class Hashmaps{ 
    public static boolean Anagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        // pushing each character from s into map
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1); // if char is in the map then do +1 to frequency else just make 1 as frequency
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){ // if map is not empty
                if(map.get(ch) == 1){ if map count is 1
                    map.remove(ch); // directly remove from map
                }
                else{
                    map.put(ch,map.get(ch)-1); // decrease freq by 1
                }

            }
            else{
                return false;
            }

        }
        return map.isEmpty();
    }


    public static void main(String args[]){
        String s = "tulip";
        String t = "lipid";
        System.out.println(Anagram(s,t));

        // create hashmap
        // HashMap<String, Integer> hm = new HashMap<>();

        // // Insert - O(1)
        // hm.put("India",200);
        // hm.put("US",100);
        // hm.put("Russia",99);
        // hm.put("Israel",80);

        // System.out.println(hm);

        // // Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // // containsKey - O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("nepal"));

        // // remove - O(1)
        // System.out.println(hm.remove("US"));
        // System.out.println(hm);

        // // size
        // System.out.println(hm.size());

        // // isEmpty()
        // // hm.clear(); // clears the hashmap
        // System.out.println(hm.isEmpty());

        // // Iteration over HashMap
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);
        // for(String k : keys){
        //     System.out.println("keys="+k+ ",value="+ hm.get(k));
        // } 

        ///// Majority Element /////
        // int arr[] = {1,3,2,5,1,5,5,3,1,5,1};
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i],map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i],1);

        //     }
        // }
        // Set<Integer> keySet = map.keySet();
        // for(Integer key:keySet){
        //     if(map.get(key)>arr.length/3){
        //         System.out.println(key);
        //     }
        // }


    }
}