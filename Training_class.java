import java.util.*;
public class Training_class{
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

    // add first
    public void addFirst(int data){
        Node newNode =  new Node(data);
        size++;
        if(head == null){
            head = tail = null;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // printing LinkedList
    public void printll(){
        if(head == null){
            System.out.println("linkedlist is empty!");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // add last
    // add first
    public void addlast(int data){
        Node newNode =  new Node(data);
        size++;
        if(head == null){
            head = tail = null;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }




    

    public static void main(String args[]){
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.addFirst(6);
        // ll.printll();

        // System.out.println();

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printll();



        

        
        
        

    }

}