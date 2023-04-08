import java.util.LinkedList;
public class Collection_Frameworks{
    public static void main(String args[]){
        // create a linkedlist
        LinkedList<Integer> ll = new LinkedList<>();

        //add elements
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);

        // remove elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll); // [1]
        

    }
}