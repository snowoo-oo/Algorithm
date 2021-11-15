import java.util.Arrays;
class Solution{
    public int solution(int[] citations){
        int n = citations.length;
        int hIndex = 0;
        
        for(int i=1;i<=n;i++){
            int up = 0; int down = 0;
            for(int j=0;j<n;j++){
                if(i>=citations[j])
                    up++;
                if(i<=citations[j])
                    down++;
            }
            if(i >= up && i<= down){
                hIndex = Math.max(i, hIndex);
            }
        }
        
        return hIndex;
    }
}

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for(int i=1;i<=citations.length;i++)
        {
            int up = 0; int down = 0;
            for(int j=0;j<citations.length;j++)
            {
                if(i >= citations[j])
                    up++;
                if(i<=citations[j])
                    down++;
            }
            if(i>=up && i <= down)
                answer = Math.max(i,answer);
        }
        return answer;
    }
}