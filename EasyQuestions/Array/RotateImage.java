 //Time Complexity- O(N^2)
//Space Complexity- O(1)



class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp= matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
        
    }
}