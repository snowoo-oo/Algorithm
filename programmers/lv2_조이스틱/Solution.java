class Solution{
    public int solution(String name){
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for(int i=0;i<name.length();i++){
            sb.append("A");
        }
        
        if(sb.toString().equals(name))return answer;
        
        int nowIdx = 0;
        while(true){
            int moves = Math.min(name.charAt(nowIdx) - 'A', 'Z' - name.charAt(nowIdx) + 1);
            sb.setCharAt(nowIdx, name.charAt(nowIdx));
            answer += moves;
            
            if(sb.toString().equals(name)) break;
            
            int leftIdx = nowIdx;
            int leftCnt = 0;
            while(sb.charAt(leftIdx) == name.charAt(leftIdx)){
                leftIdx--;
                leftCnt++;
                if(leftIdx == -1){
                    leftIdx = name.length()-1;
                }
            }
            
            int rightIdx = nowIdx;
            int rightCnt = 0;
            while(sb.charAt(rightIdx) == name.charAt(rightIdx)){
                rightIdx++;
                rightCnt++;
                if(rightIdx==name.length()){
                    rightIdx = 0;
                }
            }
            
            if(leftCnt < rightCnt){
                answer += leftCnt;
                nowIdx = leftIdx;
            }
            else{
                answer += rightCnt;
                nowIdx = rightIdx;
            }
        }
        
        return answer;
    }
}