import java.util.Stack;
class Solution{
    public String solution(String number, int k){
        
        char[] result = new char[number.length()-k];
        
        Stack<Charater> stack = new Stack<>();
        
        for(int i=0;i<number.length();i++){
            char c = number.charAt(i);
            
            while(!stack.empty() && stack.peek() < c && k-- > 0){
                stack.pop();
            }
            stack.push(c);
        }
        
        for(int i=0;i<result.length;i++)
            reuslt[i] = stack.get(i);
        
        return new String(result);
    }
}