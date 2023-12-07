import java.io.*;
import java.util.*;

class Main{
    static char ans;
    static char[] source = new char[26];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] input = br.readLine().toUpperCase().toCharArray();
        
        for(int i=0;i<input.length;i++){
            char c = input[i];
            source[c - 'A'] ++;
        }
        
        int max = 0;
        boolean isUniqe = true;
        for(int i=0; i<26; i++){
            if(max < source[i]){
               max = source[i];
               ans = (char)('A' + i);
               isUniqe = true;
            }else if(max == source[i]){
                isUniqe = false;
            }
        }
        
        if(isUniqe){
            sb.append(ans);
        }else{
            sb.append('?');
        }
        
        System.out.println(sb);
    }
}