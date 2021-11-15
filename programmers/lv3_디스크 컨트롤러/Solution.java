import java.util.*;
class Solution{
    int solution(int[][] jobs){
        PriorityQueue<Work> pq = new PriorityQueue<Work>(new Comparator<Work>(){
            int compare(Work a, Work b){
                if(a.dueTime < b.dueTime) return -1;
                else if(a.dueTime > b.dueTime) return 1;
                else return 0;
            }
        });
        
        LinkedList<Work> list = new LinkedList<>();
        for(int[] job : jobs){
            list.add(new Work(job[0], job[1]));
        }
        
        Collections.sort(list, new Comparator<Work>(){
            int compare(Work a, Work b){
                if(a.requestTime < b.requestTime) return -1;
                else if(a.requestTime > b.requestTime) return 1;
                else return 0;
            }
        });
        
        int cnt = 0;
        int answer = 0;
        int time = list.peek().requestTime;
        while(cnt < jobs.length){
            while(!list.isEmpty() && list.peek().requestTime <= time){
                pq.add(list.pollFirst());
            }
            
            if(!pq.isEmpty()){
                Work work = pq.poll();
                time += work.dueTime;
                answer += time - work.requestTime;
                cnt++;
            }
            else
                time++;
        }
        
        return answer / cnt;
    }
}

class Work{
    int requestTime;
    int dueTime;
    Work(int requestTime, int dueTime){
        this.requestTime = requestTime;
        this.dueTime = dueTime;
    }
}