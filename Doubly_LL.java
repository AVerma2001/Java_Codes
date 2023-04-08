import java.util.*;
public class Doubly_LL{
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    // addfirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){ // if no node is present in the linkedlist
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // remove first node
    public int removeFirst(){
        if(head == null){
            return -1;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // print doubly LinkedList
    public void printdll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public static void main(String args[]){
        Doubly_LL dll = new Doubly_LL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printdll();
        dll.removeFirst();
        dll.printdll();
        System.out.println(dll.size);

    }

}