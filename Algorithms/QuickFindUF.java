// Implementation of Quick Find
// Time complexity- O(N^2)

public class QuickFindUF{

    private int[] id;

    QuickFindUF(int N){
        id= new int[N];
        for(int i=0;i<N;i++){
            id[i]=i;
        }
    }


    public boolean connected(int p, int q){
        return id[p]==id[q];
    }


    public void Union(int p, int q){
        int pid=id[p];
        int qid=id[q];

        for(int i=0;i<id.length;i++){
            if(id[i]==pid){
                id[i]=qid;
            }
        }
    }
}