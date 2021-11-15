import java.util.*;
class Solution{
    int solution(int[] priorities, int location){
        PriorityQueue<Integer> pq = new LinkedList<>(Collections.reverseOrder());
        Queue<Info> q = new Queue<>();
        
        for(int i=0;i<priorities.length;i++){
            pq.add(priorities[i]);
            q.add(new Info(priorities[i], i);
        }
        
        int cnt = 0;
        while(!q.isEmpty()){
            
            Info info = q.poll();
            if(info.value == pq.peek()){
                pq.remove();
                cnt++;
                if(info.idx == location)
                    break;
            }else{
                q.add(info);
            }
        }
                  
                  
        return cnt;
    }
}

class Info{
    int value;
    int idx;
    
    Info(int value, int idx){
        this.value = value;
        this.idx = idx;
    }
}