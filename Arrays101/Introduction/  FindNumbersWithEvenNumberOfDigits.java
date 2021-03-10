class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int numberOfDigit = 0;
        
        for (int i : nums) {
            while(i>0) {
                i = i/10;
                numberOfDigit++;
            }
            
            if(numberOfDigit % 2 == 0) {
                count ++;
            }
            
            numberOfDigit = 0;
        }
        
        return count;
    }
}


// Another Solution 
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int n : nums) {
            if(String.valueOf(n).length() % 2 == 0) res++;
        }
        return res;
    }
}