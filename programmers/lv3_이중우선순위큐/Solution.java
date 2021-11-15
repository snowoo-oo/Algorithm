import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Collections;
class Solution{
    int[] solution(String[] operations){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<operations.length;i++){
            StringTokenizer st = new StringTokenizer(operations[i], " ");
            String cmd = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            
            if(cmd.equals("I")){
                minHeap.add(value);
                maxHeap.add(value);
            }
            else{
                if(!minHeap.isEmpty() && !maxHeap.isEmpty()){
                    if(value < 0){
                        int min = minHeap.remove();
                        maxHeap.remove(min);
                    }
                    else{
                        int max = maxHeap.remove();
                        minHeap.remove(max);
                    }
                }
            }
        }
        
        int[] answer = {0,0};
        if(minHeap.size() > 0){
            answer[0] = maxHeap.poll();
            answer[1] = minHeap.poll();
        }
        
        return answer;
    }
}