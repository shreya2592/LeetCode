// Time Complexity - O(N)
// Space Complexity- O(1)

class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result= new ArrayList<>();
        int k=0,i;
        
        for( i=1;i<S.length();i++){
            if(S.charAt(i)==S.charAt(k)){
                continue;
            }
            
            else if(S.charAt(i)!=S.charAt(k)){
                int count = ((i-1)-k)+1;
                if(count>=3){
                    List<Integer> res= new ArrayList<>();
                    res.add(k);
                    res.add(i-1);
                    result.add(res);
                }
                
                k=i;
            }
        }
        
        if(((i-1)-k)+1 >=3 ){
            List<Integer> res= new ArrayList<>();
                    res.add(k);
                    res.add(i-1);
                    result.add(res);
        }
        
        return result;
    }
}