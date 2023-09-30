import java.util.*;
public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        // step 1 --- create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;

        }

        // step 2 --- newNode next  = head
        newNode.next = head; // link

        // step 3 --- head = newNode
        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode; 
    }

    public void printll(){
        if(head == null){
            System.out.println("Linked List is empty!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx-1 --> temp = prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is empty!");
            return Integer.MIN_VALUE;
        }
        else if(size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;

        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;

        }
        int val = prev.next.data; // store data that is being deleted
        prev.next = null;
        tail = prev;
        size--;
        return val;


    }

    // Iterative Search
    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
        
    }

    // Recursive Search Approach
    // helper function
    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    // Reversing a Linked List ---> O(n)
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            // steps for reversing
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Deleting nth node from end
    public void deleteNthfromend(int n){
        // calculate size
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){ // remove first ---> node to be deleted from end = size of linkedlist ---> first element
            head=head.next;
            return;
        }
        // size-n
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        // Reached size-n
        prev.next = prev.next.next;
        return;
    }

    // To find mid node of a linked list using FAST-SLOW Approach-(Turtle Hare)
    public static Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;//+1 step
            fast = fast.next.next;//+2 steps

        }
        return slow;//mid node
    }

    // Program to find if a linked List is a pallindrome or not
    public boolean checkPallindrome(){
        if(head ==  null || head.next == null){
            return true;
        }
        // find middle
        Node mid = findmid(head);

        // Reverse 2nd half
        Node curr = mid;
        Node prev=null;
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;

        // check if right half equals left half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;// if left data = right data then comoare next
            right = right.next;

        }
        return true;
    }

    // Detect a cycle/loop in the linkedlist ------ Floyd's cycle finding algorithm 
    public static boolean isCycle(){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if(slow == fast){
                return true; // cycle exists
            }

        }
        return false;
    }

    // Remove a cycle in a linkedlist
    public static void removeCycle(){

        // detect cycle
        Node slow= head;
        Node fast = head;
        boolean cycle = false; // to track presence of cycle
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // finding the meeting point
        slow = head;
        Node prev = null; // Last node
        while(slow!=fast){
            prev=fast;
            slow = slow.next;
            fast = fast.next;

        }

        // remove cycle
        prev.next = null;
    }

    // ZIG ZAG LL Code
    public void ZigZag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // Reverse 2nd Half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        // alternate merge ---> zig zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    // intersection of two nodes
    


    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        System.out.println(findmid(head));


        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(2);
        // ll.addLast(4);
        // System.out.println(ll.findMid());

        // ll.printll();
        // ll.ZigZag();
        // ll.printll();


        // 1-2-3-1
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next=temp;
        // head.next.next.next = head;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        

        //palindrome
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // // ll.addLast(1);
        // ll.printll();

        // System.out.println(ll.checkPallindrome());
        
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.printll();

        // ll.deleteNthfromend(3);
        // ll.findmid();
        // ll.printll();

        // ll.reverse();
        // ll.printll();

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printll();

        // ll.removeLast();
        // ll.printll();
        // System.out.println(ll.size);


    }
}