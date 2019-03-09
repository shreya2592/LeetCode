class Solution {
    Map<Integer, Integer> cache = new HashMap<>();

    public int fib(int N) {
    
        if(cache.containsKey(N))
            cache.get(N);
        
        int result;
        
        if(N<2)
            result= N; 
        
        else{
            result= fib(N-1)+ fib(N-2);
        }
        
        cache.put(N, result);
        
        return result;
        
        
        
        
    }
}