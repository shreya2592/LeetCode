// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int minimumTime(int numOfParts, List<Integer> parts){
        if(parts==null|| parts.size()==0){
            return 0;
        }
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        for(int part: parts){
            priorityQueue.offer(part);
        }
        int result = 0;
        while(priorityQueue.size()>1){
            int sum = priorityQueue.poll() + priorityQueue.poll();
            result += sum;
            priorityQueue.offer(sum);
        }
        return result;
    }

    int minimumTime2(int numOfParts, List<Integer> parts)
    {
        // WRITE YOUR CODE HERE
        if(parts==null|| parts.size()==0)
            return 0;


        List<Integer> list = new ArrayList<Integer>();
        Collections.sort(parts);
        int sum=parts.get(0);
        for(int i =1;i<parts.size();i++){
            sum+=parts.get(i);
            list.add(sum);
        }

        int result=0;
        for(int i=0;i<list.size();i++){
            result+=list.get(i);
        }

        return result;
    }
    // METHOD SIGNATURE ENDS
}