import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Coding_queue{

    //// Interleave two given Queues ////
    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        // removing from given queue and adding to new queue
        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }
        //adding to existing queue by interleaving
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        
    }

    //// Reversing a queue ////
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        // int size = q.size();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    ///// FIRST NON REPEATING LETTER IN A STREAM OF CHARACTER /////
    // public static void printNonRepeating(String str){
    //     int freq[] = new int[26]; // 'a'-'z'
    //     // PriorityQueue<Character> q = new PriorityQueue<Character>();
        
    //     // Queue<Character> q = new LinkedList<>();
        
    //     for(int i=0;i<str.length();i++){
    //         char ch = str.charAt(i);
    //         q.add(ch);
    //         freq[ch-'a']++;

    //         while(!q.isEmpty() && freq[q.peek()-'a']>1){
    //             q.remove();
    //         }
    //         if(q.isEmpty()){
    //             System.out.print(-1+" ");
    //         }
    //         else{
    //             System.out.print(q.peek()+" ");
    //         }
    //     }
    //     System.out.println();

    // }




    public static void main(String args[]){
        // String str = "aabccxb";
        // printNonRepeating(str);

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        reverseQueue(q);
        
        // interLeave(q);
        //print
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
            
        }
    }

}