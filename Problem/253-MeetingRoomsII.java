class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        int[] start= new int[intervals.length];
        int[] end = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            start[i]= intervals[i][0];
            end[i]=intervals[i][1];
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i=0;
        int rooms=0;
        
        for(int s : start){
            if(s<end[i])
                rooms++;
            else
                i++;
        }
        
        return rooms;
        
    }
}