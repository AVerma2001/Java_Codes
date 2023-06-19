import java.util.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class Graphs{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
        }
        public static void CreateGraph(ArrayList<Edge> graph[]){
            for(int i=0;i<graph.length;i++){
                graph[i] = new ArrayList<>();
            }

            // adding the vertex to graph
            //0 vertex
            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,2,1));

            // 1 vertex
            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,3,1));

            //2 vertex
            graph[2].add(new Edge(2,0,1));
            graph[2].add(new Edge(2,4,1));

            // 3 vertex
            graph[3].add(new Edge(3,1,1));
            graph[3].add(new Edge(3,4,1));
            graph[3].add(new Edge(3,5,1));


            //4 vertex
            graph[4].add(new Edge(4,2,1));
            graph[4].add(new Edge(4,3,1));
            graph[4].add(new Edge(4,5,1));

            //5 vertex
            graph[5].add(new Edge(5,3,1));
            graph[5].add(new Edge(5,4,1));
            graph[5].add(new Edge(5,6,1));

            // 6 vertex
            graph[6].add(new Edge(6,5,1));



        }

        /// Breadth First Search ///
        public static void BFS(ArrayList<Edge> [] graph){ // O(V+E)
            Queue<Integer> q =  new LinkedList<>();
            boolean vis[] = new boolean[graph.length];

            // source = 0
            q.add(0);

            while(!q.isEmpty()){
                int curr = q.remove();
                if(!vis[curr]){ // if curr is not in visited, visit it
                    System.out.print(curr+" ");
                    vis[curr] = true;
                    for(int i=0;i<graph[curr].size();i++){ // find the neighbour that is destination of curr, add it into the q
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }

                }
            }

        }

        /// Depth First Search ///
        public static void DFS(ArrayList<Edge> graph[], boolean vis[], int curr){
            // visit current - print curr and make vis[curr] = true
            System.out.print(curr+" ");
            vis[curr] = true;

            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    DFS(graph,vis,e.dest);

                }
            }
        }

        public static void main(String args[]){
            int V = 7;
            ArrayList<Edge> graph[] = new ArrayList[V];
            boolean vis[] = new boolean[V];
            CreateGraph(graph);
            // BFS(graph);
            DFS(graph,vis,0);
            // initialize the array with empty arraylists
            

            // finding e's neighbours
            // for(int i=0;i<graph[2].size();i++){
            //     Edge e = graph[2].get(i); // info of edge - src,dest,wt
            //     System.out.println(e.dest);
            // }


    }
}