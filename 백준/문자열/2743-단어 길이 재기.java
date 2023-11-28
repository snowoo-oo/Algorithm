import java.util.*;
import java.io.*;

class Main{
    static String s;
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        n = s.length();
        System.out.println(n);
    }
}