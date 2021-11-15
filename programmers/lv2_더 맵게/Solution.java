import java.util.*;
class Solution{
    public int solution(int[] scoville, int K){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0;i<scoville.length;i++)
            pq.add(scoville[i]);
        
        int cnt = 0;
        while(pq.size() > 1){
            
            int first = pq.peek();
            if(first >=K) break;
            
            pq.remove();
            int second = pq.poll();
            
            int mix = first + second * 2;
            pq.add(mix);
            cnt++;
        }
        
        if(pq.peek() >= K)
        {
            return cnt;
        }
        else
        {
            return -1;
        }
    }
}