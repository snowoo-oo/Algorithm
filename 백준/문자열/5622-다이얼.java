import java.io.*;
import java.util.*;

class Main{
    static int ans;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();

        for(int i=0; i<c.length; i++){
            ans += getTime(c[i]);
        }

        System.out.println(ans);
    }

    static int getTime(char c){
        int result = 0;
        if(c >= 'A' && c <= 'O')
            result = (c - 'A') / 3 + 3;
        else
            if(c >= 'P' && c <= 'S')
                result = 8;
            else if(c >= 'T' && c<= 'V')
                result = 9;
            else 
                result = 10;
        return result;
    }
}