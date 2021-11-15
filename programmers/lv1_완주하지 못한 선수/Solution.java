import java.util.HashMap;
class Solution{
    public String solution(String[] participant, String[] completion){
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        int n = participant.length;
        for(int i=0;i<n;i++)
        {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        int m = completion.length;
        for(int i=0;i<m;i++)
        {
            map.put(completion[i], map.get(completion[i]) - 1);
        }
        
        for(String a : map.keySet())
        {
            if(map.get(a) == 1)
            {
                answer = a;
                break;
            }
        }
        return answer;
    }
}