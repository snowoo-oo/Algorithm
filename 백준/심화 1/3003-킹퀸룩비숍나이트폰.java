import java.io.*;
import java.util.*;

class Main{
    static int[] white = new int[6];
    static int[] black = {1, 1, 2, 2, 2, 8};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        for(int i=0;i<6;i++){
            int k = Integer.parseInt(input[i]);
            white[i] = black[i] - k;
        }

        for(int i=0; i<6; i++){
            sb.append(white[i]).append(" ");
        }

        System.out.println(sb);
    }
}