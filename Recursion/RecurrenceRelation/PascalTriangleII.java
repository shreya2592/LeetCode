class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int [][] arr= new int [rowIndex+1][rowIndex+1];
        
        int num=rowIndex;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i =0;i<=num;i++){
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i)
                    arr[i][j]=1;
                else{
                    arr[i][j]= arr[i-1][j-1]+arr[i-1][j];
                  
                    }
                
                  if(i==num){
                        list.add(arr[i][j]);
                }
            }
        }
        return list;
        
        
    }
}