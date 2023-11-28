import java.util.*;
import java.io.*;

class Main{
    static char[] s;
    static int i;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine().toCharArray();
        i = Integer.parseInt(br.readLine());
        System.out.println(s[i-1]);
    }
}