// Time Complexity- O(n log n)

class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        
        int[] start= new int[intervals.length];
        int[] end= new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        for(int i=1;i<intervals.length;i++){
            if(end[i-1] >start[i])
                return false;
        }
        
        return true;
    }
}
