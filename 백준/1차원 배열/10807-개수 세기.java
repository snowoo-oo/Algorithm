import java.util.*;
import java.io.*;

class Main{
    static int n,v, ans;
    static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        v = Integer.parseInt(br.readLine());
        arr = new int[input.length];
        for(int i=0; i<input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
            if(arr[i] == v) ans++;
        }

        System.out.println(ans);
    }
}