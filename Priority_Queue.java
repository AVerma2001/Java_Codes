import java.util.PriorityQueue;
import java.util.*;

public class Priority_Queue{

    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;
        public Row(int soldiers, int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override
        public int compareTo(Row r2){
            if(this.soldiers == r2.soldiers){
                return this.idx - r2.idx; // compare on the basis of index(because number of soldiers are equal)
            }
            else{
                // sort on basis of number of soldiers
                return this.soldiers-r2.soldiers;

            }
        }
    }

    // static class Student implements Comparable<Student> {
    //     String name;
    //     int rank;

    //     public Student(String name, int rank){
    //         this.name = name;
    //         this.rank = rank;
    //     }
    //     @Override
    //     public int compareTo(Student s2){
    //         return this.rank-s2.rank;

    //     }
    // }

    ///// Nearest Cars to Origin /////

    // static class Point implements Comparable<Point>{
    //     int x;
    //     int y;
    //     int distsq;
    //     int idx;
    //     public Point(int x, int y, int distsq, int idx){
    //         this.x = x;
    //         this.y = y;
    //         this.distsq = distsq;
    //         this.idx = idx;
    //     }
    //     @Override
    //     public int compareTo(Point p2){
    //         return this.distsq - p2.distsq;
    //     }
    // }

    public static void main(String args[]){

        int army[][] = {{1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}};
        int k=2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count =0;
            for(int j=0;j<army[0].length;j++){
                if(army[i][j] == 1){
                    count +=1;
                }
                else{
                    count += 0;
                }
            }
            pq.add(new Row(count,i));

        }
        for(int i=0;i<k;i++){
            System.out.println("R"+ pq.remove().idx);
        }                

        // int ropes[] = {2,3,3,4,6};
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // for(int i=0;i<ropes.length;i++){ // adding each rope length to pq
        //     pq.add(ropes[i]);

        // }
        // int cost = 0;
        // while(pq.size()>1){ // till only one value is left in pq
        //     int min1 = pq.remove(); // first minimum
        //     int min2 = pq.remove(); // second minimum after removal of first minimum
        //     cost += min1+min2;
        //     pq.add(min1+min2); // adding sum of two minimums to pq

        // }
        // System.out.println("The cost is:" + cost);

        // int pts[][] = {{3,3},{5,-1},{-2,4}};
        // int k=2;

        // PriorityQueue<Point> pq  =  new PriorityQueue<>();
        // for(int i=0;i<pts.length;i++){
        //     int distsq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
        //     pq.add(new Point(pts[i][0], pts[i][1], distsq,i));
        // }

        // // nearest cars
        // for(int i=0;i<k;i++){
        //     System.out.println("C"+ pq.remove().idx);
        // }


        // PriorityQueue<Integer> pq  =  new PriorityQueue<>(); // this is ascending order priority -> least integer highest priority
        // for giving priority in descending order -> highest integer highest priority
        // PriorityQueue<Integer> pq  =  new PriorityQueue<>(Comparator.reverseOrder());
        
        // pq.add(new Student("A",4)); // O(logn)
        // pq.add(new Student("B",1));
        // pq.add(new Student("C",3));
        // pq.add(new Student("D",2));

        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek().name+"->"+pq.peek().rank); // O(1)
        //     pq.remove(); // O(logn)
        // }
    }
}