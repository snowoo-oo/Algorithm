import java.io.*;
import java.util.*;

class Main{
    static int n, ans;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();
        for(int i=0;i<n;i++){
            ans += (c[i] - '0');
        }

        sb.append(ans);
        System.out.println(ans);

    }
}