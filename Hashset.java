import java.util.*;
public class Hashset{
    public static void main(String args[]){
        
        /////////////////////////////////////
        ///// Unions and Intersection /////
        HashSet<Integer> set = new HashSet<>();
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        // Union
        // add elements of first array to set
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
            
        }  
        // // add elements of second array to set
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
            
        }   
        System.out.println("union="+set.size()); // size gives the number of elements in union set

        


        set.clear(); // clear the set

        int count = 0;
        //Intersection
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        } 
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("intersection=" + count);
        

        /////////////////////////////////////////


        ////////////////////////////////
        ///// Count Distinct Elements /////
        // int num[] = {4,3,2,5,6,7,3,4,2,1};
        // HashSet<Integer> set = new HashSet<>();
        // for(int i=0;i<num.length;i++){
        //     set.add(num[i]);
        // }
        // System.out.println("ans="+ set.size());
        /////////////////////////////////////////////


        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(1);
        // set.add(2);
        // System.out.println(set);
        // set.clear();
        // System.out.println(set.size());
        // set.remove(1);
        // System.out.println(set);

        ///////////////////////////////////////////////
        // iteration on sets
        // HashSet<String> cities = new HashSet<>();
        // cities.add("Mumbai");
        // cities.add("Delhi");
        // cities.add("Varanasi");
        // cities.add("Bhopal");
        // // method 1
        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // // method 2
        // for(String city : cities){
        //     System.out.println(city);
        // }
        /////////////////////////////////////////////////////////

        
    }
}