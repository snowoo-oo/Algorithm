import java.io.*;
import java.util.*;

class Main{
    static int ans;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbb = new StringBuilder();
        String s = br.readLine();
        if(sbb.append(s).reverse().toString().equals(s)){
            sb.append(1);
        }else{
            sb.append(0);
        }

        System.out.println(sb);
    }
}