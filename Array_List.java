import java.util.*;
// import java.util.ArrayList;
public class Array_List{
    /// function to swap ///
    public static void Swap(ArrayList<Integer> list, int idx1 ,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }
    
        // classname object name = new classname();
        // ArrayList <Integer> list = new ArrayList<>();
        // ArrayList <String> list2 = new ArrayList<>();
        // ArrayList <Boolean> list3 = new ArrayList<>();

        // add operation --- O(1)
        // list.add(2);
        // list.add(9);
        // list.add(4);
        // list.add(7);
        // list.add(6);
        //add opertion at index ---O(n)
        // list.add(3,7);
        // System.out.println(list);
        // System.out.println(list);
        //get operation
        // int element = list.get(2);
        // System.out.println(element);
        
        // remove operation
        // list.remove(2);

        // set operation ------- list.set(index,new element)
        // list.set(2,10); 

        // contains operation --------- list.contains() --- true or false
        // System.out.println(list.contains(11));
        
        // System.out.println(list.contains(1));

        // size function --- prints the size of arraylist
        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        //////// reverse a list --- O(n)//////
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        //// finding maximum element in the array list
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     // if(max<list.get(i)){
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max,list.get(i));

        // }
        // System.out.println(max);


        /////// Swapping two indexes in an array list
        // int idx1= 1;
        // int idx2 = 3;
        // System.out.println(list);
        // Swap(list,idx1,idx2);

        /// Sorting the list in ascending order
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);

        ////////// MultiDirectional Arraylists /////////
        // ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); list.add(2);
        // mainList.add(list);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3); list2.add(4);
        // mainList.add(list2);

        // for(int i=0;i<mainList.size();i++){
        //     ArrayList <Integer> currList = mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);

        /// print 1234 --- 2468---- 36912
        // ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
        
        // for(int i=1;i<=5;i++){
        //     list1.add(i*1); // 1234
        //     list2.add(i*2); // 2468
        //     list3.add(i*3); // 36912
        // }
        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);
        // System.out.println(mainList);

        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+ " ");
        //     }
        //     System.out.println();

        // }


        ////// container with maximum water ////// -------- O(n^2)
        // public static int Maxwater(ArrayList<Integer> height){
        //     int maxwater = 0;
        //     for(int i=0;i<height.size();i++){
        //         for(int j=i+1;j<height.size();j++){
        //             int ht = Math.min(height.get(i),height.get(j));
        //             int width = j-i;
        //             int currwater = ht*width;
        //             maxwater = Math.max(maxwater,currwater);
        //         }
        //     }
        //     return maxwater;
        // }

        // 2 pointer approach for container with maximum water ----O(n)
        public static int storewater(ArrayList<Integer> height){
            int maxwater = 0;
            int lp = 0; // left pointer
            int rp = height.size()-1; // right pointer
            while(lp<rp){
                // calculate water area
                int ht = Math.min(height.get(lp),height.get(rp));
                int width = rp-lp;
                int currwater = ht*width;
                maxwater = Math.max(maxwater,currwater);

                // update pointer
                if(height.get(lp)<height.get(rp)){
                    lp++;
                }
                else{
                    rp--;
                }
            }
            return maxwater;
        }

        ////// pair sum --- brute force approach O(n^2)
        // public static boolean pairsum1(ArrayList<Integer> height ,  int target){
        //     for(int i=0;i<height.size();i++){
        //         for(int j=i+1;j<height.size();j++){
        //             if(height.get(i)+height.get(j)==target){
        //                 return true;
        //             }
        //         }
        //     }
        //     return false;
        // }

        public static boolean pairsum1(ArrayList<Integer> height ,  int target){
            int lp =0;
            int rp = height.size()-1;
            while(lp != rp){
                // case1
                if(height.get(lp)+height.get(rp) == target){
                    return true;
                }
                // case2 
                if(height.get(lp)+height.get(rp)<target){
                    lp++;
                }
                else{
                    // case 3
                    rp--;
                }

            }
            return false;
        }

        ///// Monotonic ArrayList /////
        public static boolean Monotic(ArrayList<Integer> height){
            for(int i =0;i<height.size();i++){
                boolean a =true;
                boolean b =false;
                if(height.get(i)<height.get(i+1)){
                    return true;
                }
                else if(height.get(i)>height.get(i+1)){
                    return true;
                }
                
            }
            return false;
        }


        public static void main(String args[]){
            ArrayList<Integer> height = new ArrayList<>();
            // 1 2 3 4 5 6
            height.add(1);
            height.add(2);
            height.add(2);
            height.add(1);
            // height.add(5);
            // height.add(6);
            // int target = 50;

            System.out.println(Monotic(height));
















    }
}
