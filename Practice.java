import java.util.*;
public class Practice{


    // public static int Ratfood(int r, int unit, int arr[]){
    //     if(arr == null){
    //         return -1;
    //     }
    //     int total = r*unit;
    //     int sum = 0;
    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum = sum+arr[i];
    //         count++;
    //         if(sum>=total){
                
    //             break;
    //         }
  



    //     }
    //     if(sum<total){
    //         return 0;
    //     }  
    //     return count; 
        
    // }

    // static class StackA{
    //     /// implementation using Linked List
    //     static class Node{
    //         int data;
    //         Node next;
    //         Node(int data){
    //             this.data = data;
    //             this.next = null;
    //         }
    //     }
    //     static class Stack{
    //         static Node head = null;

    //         public static boolean isEmpty(){
    //             return head == null;
    //         }
    //         //push
    //         public static void push(int data){
    //             Node newNode = new Node(data);
    //             if(isEmpty()){
    //                 head = newNode;
    //                 return;
    //             }
    //             newNode.next = head;
    //             head = newNode;
    //         }
    //         //pop
    //         public static int pop(){
    //             if(isEmpty()){
    //                 return -1;
    //             }
    //             int top = head.data;
    //             head = head.next;
    //             return top; 
    //         }
    //         // peek
    //         public static int peek(){
    //             if(isEmpty()){
    //                 return -1;
    //             }
    //             return head.data;
    //         }
    //     }
    // }

    public static boolean isPrime(int n){

        if(n == 0 || n==1){
            return false;
        }

        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printPrime(int lower,int upper){
        for(int i=lower;i<upper-6;i++){
            if(isPrime(i) && isPrime(i+6)){
                System.out.print(i+","+(i+6));
                System.out.println();
            }
        }
        

    }
        
    
    


    public static void main(String args[]){
        int lower =4;
        int upper = 30;
        printPrime(lower, upper);

        // System.out.println(isPrime(n));


        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // s.push(5);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
        // s.pop();
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }


        




        
    }
}