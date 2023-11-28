import java.io.*;
import java.util.*;

class Main{
    static int t,r;
    static String s,p;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        for(int tc=0; tc<t; tc++){
            p = "";
            String[] input = br.readLine().split(" ");
            r = Integer.parseInt(input[0]);
            s = input[1];

            for(int i=0; i<s.length(); i++){
                for(int j=0; j<r; j++){
                    p += s.charAt(i);
                }
            }
            sb.append(p).append('\n');
        }

        System.out.println(sb);
    }
}