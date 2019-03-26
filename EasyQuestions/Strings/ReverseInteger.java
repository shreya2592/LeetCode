// Time Complexity : O(n) and Space Complexity : O(1)

class Solution {
    public int reverse(int x) {
     
        
        long sum=0;
        int n=x;
        while(n!=0){
            sum=(sum*10) + (n%10);
            
            if(sum > Integer.MAX_VALUE) return 0;
            if(sum < Integer.MIN_VALUE) return 0;
            
            n=n/10;
        }
        
        return (int)sum;
        
    }
}