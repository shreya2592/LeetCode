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