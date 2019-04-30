class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        Map<Integer, Integer> degrees= new HashMap<>();
        for(int i=0;i<numCourses;i++){
            degrees.put(i, 0);
        }
        
        Map<Integer, List<Integer>> preReqChildren= new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            int[] pre= prerequisites[i];
            int main= pre[0];
            int prereq=pre[1];
            
            degrees.put(main, degrees.getOrDefault(main,0)+1);
            List<Integer> children= preReqChildren.get(prereq);
            if(children==null){
                children= new ArrayList<>();
            }
            
            children.add(main);
            preReqChildren.put(prereq, children);
        }
        
        
        Queue<Integer> bfs= new LinkedList<>();
        for(Map.Entry<Integer, Integer> cur : degrees.entrySet()){
            if(cur.getValue()==0){
                bfs.add(cur.getKey());
            }
        }
        
        while(!bfs.isEmpty()){
            Integer next= bfs.remove();
            degrees.remove(next);
            
            List<Integer> children= preReqChildren.get(next);
            
            if(children!=null){
                for(int i=0;i<children.size();i++){
                    Integer degree= degrees.get(children.get(i));
                    degree -= 1;
                    if(degree==0)
                        bfs.add(children.get(i));
                    
                    degrees.put(children.get(i), degree);
                    
                }
            }
        }
        
        return degrees.isEmpty();
    }
}