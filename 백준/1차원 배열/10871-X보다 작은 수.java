import java.util.*;
import java.io.*;

class Main{
    static int n,x;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        x = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int k = Integer.parseInt(input[i]);
            if(k < x){
                sb.append(k).append(" ");
            }
        }
        
        System.out.println(sb);
    }
}  