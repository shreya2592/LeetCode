class Solution {
    public int[][] transpose(int[][] A) {
        
        if(A==null || A.length==0)
            return A;
        
        int R=A.length;
        int C= A[0].length;
        int[][] ans= new int[C][R];
         for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
              ans[j][i]=A[i][j];
            }
        }
        
        return ans;
    }
}