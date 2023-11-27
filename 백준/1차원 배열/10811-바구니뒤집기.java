import java.util.*;
import java.io.*;

class Main{
    static int[] arr;
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        arr = new int[n+1];
        for(int i=1;i<=n;i++)
            arr[i] = i;
        
        for(int i=0;i<m;i++){
            input = br.readLine().split(" ");
            int left = Integer.parseInt(input[0]);
            int right = Integer.parseInt(input[1]);
            
            while(left < right){
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++; right--;
            }
        }
        
        for(int i=1;i<=n;i++){
            sb.append(arr[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}