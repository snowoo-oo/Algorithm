import java.util.*;
import java.io.*;

class Main{
    static int n;
    static float m;
    static float[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new float[n];
        String[] input = br.readLine().split(" ");
        for(int i=0; i<n;i++){
            arr[i] = Float.parseFloat(input[i]);
            m = Math.max(m, arr[i]);
        }

        float sum = 0;
        for(int i=0; i<n; i++){
            sum += (arr[i]/m)*100.0;
        }
        sum /= n;

        System.out.println(sum);
    }
}