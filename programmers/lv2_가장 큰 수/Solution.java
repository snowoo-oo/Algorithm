import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
class Solution{
    public String solution(int[] numbers)
    {
        String answer = "";
        List<String> list = new ArrayList<>();
        for(int num : numbers){
            list.add(Integer.toString(num));
        }
        
        Collections.sort(list, (a,b)->{
           return (b+a).compareTo(a+b); 
        });
        for(String s : list){
            answer +=s;
        }
        
        if(list.get(0).equals("0"))
            return "0";
        return answer;
    }
}