import java.util.*;
import java.io.*;

class Main{
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String s = br.readLine();
            sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append('\n');
        }

        System.out.println(sb);
    }
}