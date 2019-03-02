class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.equals("")) 
            return 0;
	    if(haystack.equals("")) 
            return -1;
        
        char[] needleArray= needle.toCharArray();
        int[] temp= tempArray(needleArray);
        
        int i=0;
        int j=0;

        while(i<haystack.length() && j< needleArray.length){

            if(haystack.charAt(i)==needleArray[j]){
                i++;
                j++;
            }
            
            else{
                if(j!=0){
                    j=temp[j-1];
                }
                else{
                    i++;
                }
            }
            
            
        }
        
        if(j==needleArray.length)
            return i-j;
        return -1;
    }

    int [] tempArray(char [] needleArray){
        
        int arr[]= new int[needleArray.length];
        int j=0;
        for(int i=1;i<needleArray.length;){
            if(needleArray[i]==needleArray[j]){
                
                arr[i]= j +1;
                j++;
                i++;
            }
            
            else{
                
                if(j!=0){
                    j=arr[j-1];
                    
                }
                else{
                    arr[i]=0;
                    i++;
                }
                
            }
        }
        
        return arr;
        
    }
}