import java.util.*;
import java.io.*;

class Main{
    static int n,m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        arr = new int[n];
        for(int a=0;a<m;a++){
            input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0])-1;
            int j = Integer.parseInt(input[1])-1;
            int k = Integer.parseInt(input[2]);
            
            for(int b=i; b<=j; b++){
                arr[b] = k;
            }
        }

        for(int i=0;i<n;i++)
            sb.append(arr[i]).append(" ");

        System.out.println(sb);

    }
}