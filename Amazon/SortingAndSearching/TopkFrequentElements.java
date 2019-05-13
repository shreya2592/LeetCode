// Time Complexiry - O(N log N)

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map= new HashMap<>();
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) +1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap= new PriorityQueue<>((a,b)-> (b.getValue() - a.getValue()));
        
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }
        
        
        ArrayList<Integer> list= new ArrayList<>();
        
        while(list.size()<k){
            Map.Entry<Integer, Integer> entry= maxHeap.poll();
            list.add(entry.getKey());
        }
        
        return list;
    }
}