import java.io.*; 
import java.util.*; 

class DFS{

    private int v;
    private LinkedList<Integer> adj[];

    DFS(int v){

        this.v=v;
        adj= new LinkedList[v];

        for(int i=0;i<v;i++){
            adj[i]= new LinkedList<>();
        }

    }


    void addEdge(int v, int w){
        adj[v].add(w);
    }


    void DFSUtil(boolean [] visited, int n){

        visited[n]=true;
        System.out.println(n+" ");
        Iterator<Integer> it= adj[n].listIterator();
        while(it.hasNext()){
            int a=it.next();
            if(!visited[a]){
                DFSUtil(visited, a);
            }

        }

    }

    void depthFirstSearch(int n){

        boolean[] visited= new boolean[v];
        
        DFSUtil(visited, n);



    }


    public static void main(String args[]) 
    { 
        DFS g = new DFS(4); 
  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Depth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.depthFirstSearch(2); 
    } 
}