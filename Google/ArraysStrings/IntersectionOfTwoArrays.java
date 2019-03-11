class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set= new HashSet<Integer>();
        Set<Integer> intersect= new HashSet<Integer>();
        
        for(int i : nums1)
            set.add(i);
        
        for(int j : nums2){
            if(set.contains(j))
                intersect.add(j);
        }
        
        
        int result[]= new int[intersect.size()];
        int i=0;
        for(int k : intersect){
            result[i++]=k;
        }
        
        
        return result;
    
       
    }
}