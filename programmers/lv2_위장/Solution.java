import java.util.HashMap;
class Solution{
    public int solution(String[][] clothes){
        
        HashMap<String, Integer> map = new HashMap<>();
        
        int n = clothes.length;
        for(int i=0;i<n;i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        
        int sum = 1;
        
        for(String s : map.keySet()){
            sum *= (map.get(s) + 1);
        }
        
        return sum - 1;
    }
}