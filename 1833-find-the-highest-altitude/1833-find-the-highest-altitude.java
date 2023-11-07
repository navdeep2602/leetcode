import java.lang.Math;
class Solution {
    public int largestAltitude(int[] gain) {
       PriorityQueue<Integer> heap
            = new PriorityQueue<Integer>(
                Collections.reverseOrder());
       int m=0;
       heap.add(m);
       for(int i=0;i<gain.length;i++)
       {
           m+=gain[i];
           heap.add(m);
       }
       return heap.peek();
    }
}