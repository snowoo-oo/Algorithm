class Solution{
    public int[] solution(int brown, int yellow){
        int[] answer = new int[2];
        
        int total = brown + yellow;
        
        for(int i=3;i<=total;i++){
            if(total % i ==0){
                int a = i;
                int b = total/i;
                
                if((a-2) * (b-2) == yellow){
                    if(a > b){
                        answer[0] = a;
                        answer[1] = b;
                    }
                    else{
                        answer[0] = b;
                        answer[1] = a;
                    }
                }
            }
        }
        
        return answer;
    }
} 