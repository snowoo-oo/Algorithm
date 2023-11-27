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
        arr = new int[n+1];
        for(int i=1;i<=n;i++)
            arr[i] = i;

        for(int a=0; a<m; a++){
            input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i=1; i<=n; i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);

    }
}