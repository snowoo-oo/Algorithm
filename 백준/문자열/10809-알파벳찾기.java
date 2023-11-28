import java.io.*;
import java.util.*;

class Main{
    static StringBuilder sb = new StringBuilder();
    static int[] ans = new int[26];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i=0; i<26; i++){
            ans[i] = -1;
        }

        for(int i=0;i<s.length();i++){
            int k = s.charAt(i) - 'a';
            if(ans[k] == -1)
                ans[k] = i;
        }

        for(int i=0; i<26; i++){
            sb.append(ans[i]).append(" ");
        }

        System.out.println(sb);
    }
}