import java.util.*;
import java.io.*;

class Main{
    static boolean[] arr = new boolean[31];
    static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0 ;i<28; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num] = true;
        }
        
        for(int i=1;i<=30;i++){
            if(!arr[i]){
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
                
        }
        
        sb.append(min).append('\n');
        sb.append(max).append('\n');

        System.out.println(sb);
    }
}