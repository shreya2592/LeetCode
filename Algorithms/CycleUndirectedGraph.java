import java.util.ArrayList;
import java.util.LinkedList;


public class CycleUndirectedGraph{


    static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){

            this.src=src;
            this.dest=dest;
        }
    }

    static class Graph{
        int v;
        LinkedList<Edge> [] adj;
        ArrayList<Edge> allEdges=new ArrayList<>();

        Graph(int v){
            this.v=v;
            adj=new LinkedList[v];

            for(int i=0;i<v;i++){
                adj[i]=new LinkedList<>();
            }
        }
    

    public void addEdge(int src, int dest){
        Edge edge= new Edge(src,dest);
        adj[src].addFirst(edge);
        allEdges.add(edge);
    }

    public void makeSet(int[] parent){
        for(int i=0;i<v;i++){
            parent[i]=i;
        }
    }

    public int find(int[] parent, int vertex){
        if(parent[vertex]!=vertex){
            return find(parent, parent[vertex]);
        }

        return vertex;
    }

    public void union(int[] parent, int x, int y){
        int xParent=find(parent, x);
        int yParent=find(parent, y);
        parent[yParent]=xParent;

    }

    public boolean isCycle(){
        int[] parent= new int[v];

        makeSet(parent);
        for(int i=0;i<allEdges.size();i++){
            Edge edge= allEdges.get(i);
            int xSet=find(parent, edge.src);
            int ySet=find(parent, edge.dest);

            if(xSet==ySet)
                return true;
            else{
                union(parent, xSet, ySet);
            }
        }

        return false;

    }
}


    public static void main(String[] args) {
        int vertices = 6;
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(2, 3);
        graph.addEdge(4, 5);
        System.out.println("Graph contains cycle: " + graph.isCycle());
    }


}




