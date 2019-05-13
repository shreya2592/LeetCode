class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null || matrix.length==0)
            return false;
        
        int rsize=matrix.length;
        int csize=matrix[0].length;
        
        int start=0, end= rsize * csize -1;
        
        while(start<=end){
            
            int mid=(start+end)/2;
            int midVal=matrix[mid/csize][mid%csize];
            
            if(midVal == target)
                return true;
            else if(midVal<target)
                start=mid+1;
            else
                end=mid-1;
        }
        
        return false;
    }
}
