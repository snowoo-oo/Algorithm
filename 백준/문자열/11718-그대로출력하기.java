import java.io.*;
import java.util.*;

class Main{
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "";
        while((str = br.readLine()) != null){
            sb.append(str).append('\n');
        }

        System.out.println(sb);
    }
}