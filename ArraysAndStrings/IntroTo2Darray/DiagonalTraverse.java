class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return new int[]{};
        
        if(matrix.length==1)
            return matrix[0];
        
        
        int m=matrix.length;
        int n=matrix[0].length;
        int[] result= new int[m*n];
        int i=0, j=0;
        
        for(int s=0;s<result.length;s++){
            result[s]=matrix[i][j];
            
            // going up 
            if((i+j)%2==0){
                if(j==n-1)
                    i++;
                else if(i==0)
                    j++;
                else{
                    i--;
                    j++;
                }
            }
            
            // going down
            else{
                if(i==m-1)
                    j++;
                else if(j==0)
                    i++;
                else{
                    i++;
                    j--;
                }
            }
        }
        
        return result;
        
    }
}