import java.util.HashMap;
import java.util.Map;

public class DisjointSet{
    private Map<Long, Node> map = new HashMap<>();

    class Node{
        long data;
        int rank;
        Node parent; 
    }


    public void makeSet(Long data){
        Node node = new Node();
        node.data=data;
        node.parent=node;
        node.rank=0;
        map.put(data, node);
    }


    public boolean union(long data1, long data2){
        Node node1= map.get(data1);
        Node node2= map.get(data2);

        Node parent1=findSet(node1);
        Node parent2=findSet(node2);

        // If they are the part of the same set then do nothing;
        if(parent1.data==parent2.data){
            return false;
        }

        if(parent1.rank>= parent2.rank){
            parent1.rank=(parent1.rank==parent2.rank)? parent1.rank +1 :parent1.rank;
            parent2.parent=parent1;
        }
        else{
            parent1.parent=parent2;
        }

        return true;
    }


    private Node findSet(Node node){
        Node parent=node.parent;
        if(parent==node){
            return parent;
        }

        node.parent=findSet(node.parent);
        return node.parent;
    }

    public long findSet(long data){

        return findSet(map.get(data)).data;

    }

    public static void main(String args[]) {
        DisjointSet ds = new DisjointSet();
        ds.makeSet(1L);
        ds.makeSet(2L);
        ds.makeSet(3L);
        ds.makeSet(4L);
        ds.makeSet(5L);
        ds.makeSet(6L);
        ds.makeSet(7L);

        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);
        ds.union(3, 7);

        System.out.println(ds.findSet(1));
        System.out.println(ds.findSet(2));
        System.out.println(ds.findSet(3));
        System.out.println(ds.findSet(4));
        System.out.println(ds.findSet(5));
        System.out.println(ds.findSet(6));
        System.out.println(ds.findSet(7));
    }
}



   


