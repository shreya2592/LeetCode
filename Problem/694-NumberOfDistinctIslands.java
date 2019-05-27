class Solution {
    
    int[][] grid;
    boolean[][] seen;
    Set<Integer> shape;
    
    public int numDistinctIslands(int[][] grid) {
        
        this.grid=grid;
        seen= new boolean[grid.length][grid[0].length];
        Set shapes= new HashSet<HashSet<Integer>>();
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                shape=new HashSet<>();
                explore(i,j,i,j);
                if(!shape.isEmpty()){
                    shapes.add(shape);
                }
            }
        }
        
        return shapes.size();
        
    }
    
    public void explore(int i, int j, int i0, int j0){
        
        if(i>=0 && i<grid.length &&  j>=0 && j<grid[0].length && grid[i][j]==1 && !seen[i][j]){
            seen[i][j]=true;
            shape.add((i-i0)*2*grid[0].length + (j-j0));
            explore(i+1, j, i0,j0);
            explore(i-1, j, i0,j0);
            explore(i,j+1, i0,j0);
            explore(i,j-1, i0,j0);
        }
        
    }
}



    

