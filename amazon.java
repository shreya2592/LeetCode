// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int getMinimumCostToConstruct(int numTotalAvailableCities,
                                  int numTotalAvailableRoads,
                                  List<List<Integer>> roadsAvailable,
                                  int numNewRoadsConstruct,
                                  List<List<Integer>> costNewRoadsConstruct)
    {
        // WRITE YOUR CODE HERE
        Set<Edge> edges = buildGraph(roadsAvailable, costNewRoadsConstruct);
        return findCost(numTotalAvailableCities, edges);


    }


    private static Set<Edge> buildGraph(List<List<Integer>> roadsAvailable, List<List<Integer>> costNewRoads) {
        Set<Edge> edges = new HashSet<>();
        for (List<Integer> road : roadsAvailable) {
            edges.add(new Edge(road.get(0), road.get(1), 0));
        }
        for (List<Integer> road : costNewRoads) {
            edges.add(new Edge(road.get(0), road.get(1), road.get(2)));
        }
        return edges;
    }

    private static int findCost(int numCities, Set<Edge> edges) {
        Queue<Edge> pq = new PriorityQueue<>(edges);
        Union uf = new Union(numCities + 1);
        int nodes = 0;
        int totalCost = 0;
        while (!pq.isEmpty() && nodes < numCities - 1) {
            Edge edge = pq.poll();
            if (!uf.connected(edge.u, edge.v)) {
                uf.union(edge.u, edge.v);
                totalCost += edge.cost;
                nodes++;
            }

        }
        return totalCost;
    }
}

class Edge implements Comparable<Edge> {
    int v;
    int u;
    int cost;

    public Edge(int v, int u, int cost) {
        this.v = v;
        this.u = u;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge edge) {
        return Integer.compare(this.cost, edge.cost);
    }
}

class Union {
    private int[] parent;
    private int[] rank;

    public Union(int n) {
        if (n < 0) throw new IllegalArgumentException();
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int p) {
        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int parentofP = find(p);
        int parentofQ = find(q);
        if (parentofP == parentofQ) return;
        if (rank[parentofP] < rank[parentofQ]) {
            parent[parentofP] = parentofQ;
        } else {
            parent[parentofQ] = parentofP;
            if (rank[parentofP] == rank[parentofQ]) rank[parentofP]++;
        }
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    // METHOD SIGNATURE ENDS
}