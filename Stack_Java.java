import java.util.*;
public class Stack_Java{

    // PUSH AT BOTTOM
    public static void pushatBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatBottom(s,data);
        s.push(top);
    }

    // reverse a string using a stack
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString(); // convert to string from string builder
    }

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
            //peek
            // public static int peek(){
            //     if(isEmpty()){
            //         return -1;
            //     }
            //     return head.data;
            // }
    //     }
    // }

    /// Implementation of stack using arraylists
    //     static ArrayList<Integer> list = new ArrayList<>();
    //     // tell where stack is empty or not
    //     public static boolean isEmpty(){
    //         return list.size() == 0;
    //     }
    //     // push -->add data
    //     public static void push(int data){
    //         list.add(data);
    //     }
    //     // pop ---> remove data
    //     public static int pop(){
    //         if(isEmpty()){
    //             return -1;

    //         }
    //         int top = list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     // peek
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1;

    //         }
    //         return list.get(list.size()-1);
    //     }
    // }
    // public static void main(String args[]){
    //     // Using collection frameworks
    //     Stack<Integer> s = new Stack<>();
    //     // Stack s = new Stack();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);
        
    //     pushatBottom(s,4);
    //     while(!s.isEmpty()){
    //         System.out.println(s.pop());
    //     }
    // }
    
    // reverse a stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushatBottom(s,top);

    }
    public static void printstack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    // public static void main(String args[]){
    //     Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3); // 3 2 1
        

    //     reverseStack(s); // 1 2 3
    //     printstack(s);

        
    // }

    ///// STOCK SPAN PROBLEM /////
    public static void stockSpan(int stocks[], int span[]){
        // declare a stack
        Stack<Integer> s = new Stack<>();

        // span for 0th index(1st day) is always 1
        span[0] = 1;
        // push index 0 to stack
        s.push(0);
        //calculation of span from stocks array
        for(int i=1;i<stocks.length;i++){
             // i starts from 1 as for 0 its already 1
             int currPrice = stocks[i];
             //compare currprice with other prices in the stock
             while(!s.isEmpty() && currPrice>stocks[s.peek()]){
                s.pop();
             }
             if(s.isEmpty()){
                span[i] = i+1; // for last case(100)
             }
             else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;


             }
             s.push(i);

        }
    }

    // public static void main(String args[]){
    //     int stocks[] = {100,80,60,70,60,85,100};
    //     int span[] = new int[stocks.length];
    //     stockSpan(stocks,span);
    //     //printing span array
    //     for(int i=0;i<span.length;i++){
    //         System.out.println(span[i]+ " ");
    //     }
    // }

    /// VALID PARENTHESIS ///
    public static boolean isValid(String str){  // O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){ // opening
                s.push(ch);
            }
            else{
                if(s.isEmpty()){ //))))) -> no opening
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                }
                else{
                    return false;
                }
            }
            
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    /// DUPLICATE PARENTHESES ///
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // closing condition
            if(ch ==')'){
                int count =0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; // duplicate exists
                }

                else{
                    s.pop(); //opening pair
                }

            }
            else{


                // opening condition
                s.push(ch);
            }

        }
        return false;
    }
    // public static void main(String args[]){
    //     String str = "((a+b))"; // true--> duplicate exists
    //     String str1 = "(a-b)";  // false--> no duplicate exists
    //     System.out.println(isDuplicate(str1));
    //     // String str = "({})[";
    //     // System.out.println(isValid(str));

    // }

    /// MAX RECTANGLE AREA IN A HISTOGRAM ///
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];

        // Next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next smaller left
        s = new Stack<>();
        for(int i=0;i<=arr.length-1;i++){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        // Current area : width = j-i-1 = nsr[i]-nsl[i]-1
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);

        }
        System.out.println("maximum area of histogram is:" + maxArea);
    }


    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);

        
        
        
        

    }






}