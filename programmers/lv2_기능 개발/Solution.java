import java.util.*;
class Solution{
    public int[] solution(int[] progresses, int[] speeds){
        int n = progresses.length;
        int[] days = new int[n];
        
        for(int i=0;i<n;i++){
            int cnt = 0;
            
            while(progresses[i] < 100){
                progresses[i] +=speeds[i];
                cnt++;
            }
            
            days[i] = cnt;
        }
        
        int now = days[0];
        for(int i=1;i<n;i++){
            if(now > days[i]){
                days[i] = now;
            }else{
                now = days[i];
            }
        }
        
        for(int i=0;i<n;i++)
            System.out.print(days[i] + " ");
        
        return new int[];
    }
}