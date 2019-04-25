import java.io.*; 
import java.util.*; 
  

class BFS{

    private int v;
    private LinkedList<Integer> adj[];

    BFS(int v){
        this.v=v;
        adj= new LinkedList[v];

        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }


    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void breadthFirstSearch(int s){


        boolean[] visited= new boolean[v];

        Queue<Integer> queue= new LinkedList<>();
        visited[s]=true;
        queue.add(s);

        while(queue.size()!=0){
            s=queue.poll();
            System.out.println(s + " ");
            Iterator<Integer> it= adj[s].listIterator();
            while(it.hasNext()){
                int n=it.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }


    public static void main(String args[]) 
    { 
        BFS g = new BFS(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.breadthFirstSearch(2); 
    } 
}