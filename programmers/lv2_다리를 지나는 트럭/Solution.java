import java.util.*;

class Solution{
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int bridgeWeight = 0;
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i=0;i<truck_weights.length;i++){
            int nowTruckWeight = truck_weights[i];
            
            while(true){
                if(bridge.isEmpty()){
                    bridge.add(nowTruckWeight);
                    bridgeWeight += nowTruckWeight;
                    time++;
                    break;
                }else if(bridge.size() == bridge_length){
                    bridgeWeight -= bridge.poll();
                }else{
                    if(bridgeWeight + nowTruckWeight <= weight){
                        bridge.add(nowTruckWeight);
                        bridgeWeight += nowTruckWeight;
                        time++;
                        break;
                    }else{
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }
        
        
        
        return time + bridge_length;
    }
}