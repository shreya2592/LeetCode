// Time Complexity- O(n log n )



/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
                           
        if(intervals.size()<2)
            return intervals;
        List<Interval> list= new ArrayList<>();
        int[] start= new int[intervals.size()];
        int[] end = new int[intervals.size()];
        for(int i=0;i<intervals.size();i++){
            start[i]= intervals.get(i).start;
            end[i]= intervals.get(i).end;
            
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=0,j=0;i<intervals.size();i++){
            if(i==intervals.size()-1 || start[i+1]>end[i]){
                list.add(new Interval(start[j], end[i]));
                j=i+1;
            }
        }
     return list;
    }
}

