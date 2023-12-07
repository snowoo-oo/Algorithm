import java.io.*;
import java.util.*;

class Main{
    static int ans;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = br.readLine();
            for(int i=0; i<croa.length; i++){
                if(input.contains(croa[i])){
                    input = input.replace(croa[i], "!");
                }
            }
        
        ans = input.length();
        sb.append(ans);
        
        System.out.println(sb);
    }
}