import java.util.*;
import java.io.*;

class Main{
    static int idx, max = Integer.MIN_VALUE;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<9;i++){
            int k = Integer.parseInt(br.readLine());
            if(k > max){
                max = k;
                idx = i + 1;
            }
        }
        sb.append(max).append('\n');
        sb.append(idx).append('\n');
        System.out.println(sb);
    }
}