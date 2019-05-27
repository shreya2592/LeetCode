/*
Given an array of locations of N packing crates, implement an algorithm to find the locations of the M crates closest to the truck.

Input:
totalCrates an integer representing the total number of packing crates in the facility (N)
allLocations: a list where each element consists of a pair of integers representing the x and Y coordinates of the packing crates
truckCapacity: an integer representing the number of packing crates that will be moved to a new facility M 

Output: Return a list of integers where each element of the list represents x and y coordinates of the packing crates that will be moved to the new facility;

Constraints: 
truckCapacity<=totalCrates


Notes;
1. Truck's Location: 0,0
2. The distance of the truck from a warehouse location(x,y): sqrt of x^2 +y^2

Example:
input:
    totalCrates:3
    allLocations: [[1,2],[3,4],[1,-1]]
    truckCapacity: 2

output:
    [[1,-1],[1,2]]


Explanation:
    Distance  [1,2]:2.236
    Distance [3,4]: 5
    Distance [1,-1]:1.414

Time Complexity - O(n log n) - because of priority queue;
Space Complexity - O(N) 
*/

import java.util.*;

class Solution1{

    List<List<Integer>> closestLocations(int totalCrates, List<List<Integer>> allLocations, int truckCapacity){
        
        List<List<Integer>> returnList= new ArrayList<>();

        if(totalCrates<1)
        return returnList;

        PriorityQueue<List<Integer>> pq= new PriorityQueue<>(totalCrates, new Comparator<List<Integer>>(){
           
            @Override
            public int compare(List<Integer> o1, List<Integer> o2){
                return (int) ((Math.pow(o1.get(0),2)+Math.pow(o1.get(1),2))- (Math.pow(o2.get(0),2)+Math.pow(o2.get(1),2)));
            }

        });

        for(List<Integer> x: allLocations){
            pq.add(x);
        }

        for(int i=0;i<truckCapacity && !pq.isEmpty();i++){
            returnList.add(pq.poll());
        }


        return returnList;
        
    }
}
