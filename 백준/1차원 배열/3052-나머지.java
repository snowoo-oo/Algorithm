import java.util.*;
import java.io.*;

class Main{
    static boolean[] check = new boolean[42];
    static StringBuilder sb = new StringBuilder();
    static int ans;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            int n = Integer.parseInt(br.readLine()) % 42;
            check[n] = true;
        }
        for(int i=0;i<42;i++)
            if(check[i])
                ans++;
        sb.append(ans);
        System.out.println(sb);
    }
}