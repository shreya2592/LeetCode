public class Graph{
   

    class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src=src;
            this.dest=dest;
        }
    }


    int vertices;
    LinkedList<Edge> [] adj;
    ArrayList<Edge> allEdges= new ArrayList<>();

    Graph(int verrices){
        this.vertices=vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i <vertices ; i++) {
            adjList[i] = new LinkedList<>();
        }
    }


    public void addEgde(int source, int destination){
        Edge edge = new Edge(source, destination);
        adjList[source].addFirst(edge);
        allEdges.add(edge); //add to total edges
    }
}