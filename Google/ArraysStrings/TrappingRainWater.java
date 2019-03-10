class Solution {
    public int trap(int[] height) {
        
        if(height.length<=0)
            return 0;
        
        int [] left= new int[height.length];
        int total=0, right=0;
        left[0]=0;
        int sum=0;
        
        
        
        for(int i=1;i<height.length-1;i++){
            left[i]=Math.max(left[i-1], height[i-1]);   
        }
       
        
        
       for(int i=height.length-2;i>=0;i--){
           right=Math.max(right, height[i+1]);
           sum= Math.min(right, left[i])-height[i];
           if(sum>0)
               total+=sum;
           
       }
        
        return total;
    }
}