import java.io.*;
import java.util.*;

class Main{
    static int n;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        int star = 1;
        int blank = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<blank;j++){
                sb.append(" ");
            }
            for(int j=0;j<star;j++){
                sb.append('*');
            }
            blank--;
            star += 2;
            sb.append('\n');
        }

        blank = 1;
        star -= 4;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<blank;j++){
                sb.append(" ");
            }
            for(int j=0;j<star;j++){
                sb.append('*');
            }
            blank++;
            star -= 2;
            sb.append('\n');
        }

        System.out.println(sb);
    }
}