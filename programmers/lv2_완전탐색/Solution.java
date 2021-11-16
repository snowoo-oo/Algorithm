import java.util.List;
import java.util.ArrayList;

class Solution{
    char[] nums;
    boolean[] selected;
    int ans;
    List<Integer> list = new ArrayList<>();
    public int solution(String numbers){
        nums = numbers.toCharArray();
        selected = new boolean[nums.length];
        
        for(int i=1;i<=nums.length;i++){
            
            dfs(0, i, "");
        }
        
        return ans;
    }
    
    void dfs(int depth, int cnt, String s){
        if(depth == cnt){
            int k = Integer.parseInt(s);
            
            if(list.contains(k)) return;
            
            list.add(k);
            if(isPrime(k))
                ans++;
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(selected[i]) continue;
            selected[i] = true;
            dfs(depth+1, cnt, s + nums[i]);
            selected[i] = false;
        }
    }
    
    boolean isPrime(int num){
        if(num ==0 || num==1) return false;
        int len = (int)Math.sqrt(num);
        for(int i=2;i<=len;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}