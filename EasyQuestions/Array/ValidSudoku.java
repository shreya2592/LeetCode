
 //Time Complexity- O(N^2)
//Space Complexity- O(1)


class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set seen = new HashSet();
        for(int i=0; i<9;i++){
            for(int j=0;j<9;j++){
            char number = board[i][j];
            
            if(number!='.'){
                if(!seen.add(number + " in row " + i)||
                  !seen.add(number + " in column "+ j)||
                  !seen.add(number+ " in cube " + i/3 + "-"+ j/3))
                    return false;
            }
            }
        }
        
        return true;
    }
}


    
   