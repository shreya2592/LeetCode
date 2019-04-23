import java.util.Iterator;
import java.util.Stack;
import java.io.*; 
import java.util.*;

public class TopologicalSort{
        private int v;
        private LinkedList<Integer> adj[]; // Adjency list

        TopologicalSort(int v){

            this.v=v;
            adj= new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i]= new LinkedList();
            }

        }


        //Function to add edge into the graph

        void addEdge(int v, int w){
            adj[v].add(w);
        }


        // A recursive function used by topological sort

        void topoSortUtil(int v, boolean visited [], Stack stack){
            visited[v]=true;
            Integer i;
            Iterator<Integer> it= adj[v].iterator();
            while(it.hasNext()){
                i=it.next();
                if(!visited[i]){
                    topoSortUtil(i, visited, stack);
                }
            }
            
            stack.push(v);
        }

        void topoSort(){

            Stack<Integer> stack= new Stack<>();
            boolean[] visited= new boolean[v];

            for(int i=0;i<v;i++){
                if (visited[i]==false){
                        topoSortUtil(i, visited, stack);
                }
            }

            while(stack.isEmpty()==false){
                System.out.print(stack.pop()+"  ");
            }
            
        }
 

        public static void main(String args[]){
            TopologicalSort g = new TopologicalSort(6);
            g.addEdge(5, 2); 
            g.addEdge(5, 0); 
            g.addEdge(4, 0); 
            g.addEdge(4, 1); 
            g.addEdge(2, 3); 
            g.addEdge(3, 1);

            System.out.println("Following is a Topological " +  "sort of the given graph"); 
            g.topoSort();    
        }
    }



