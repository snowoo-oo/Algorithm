import java.util.*;
import java.io.*;

class Main{
    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(input[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}  