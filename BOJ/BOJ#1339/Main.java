import java.io.*;
import java.util.*;

class Main{
  static int n;
  static Integer[] arr;
  public static void main(String[] args) throws IOException, Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());
    arr = new Integer[26];
    
    Arrays.fill(arr, 0);
    
    for(int i=0;i<n;i++)
    {
      char[] input = br.readLine().toCharArray();
      
      int now = 1;
      for(int j=input.length-1; j>=0; j--)
      {
        arr[input[j] - 'A'] += Integer.valueOf(now);
        now *= 10;
      }
    }
    
    Arrays.sort(arr, Collections.reverseOrder());
    
    int num = 9;
    int sum = 0;
    for(int i=0;i<10;i++)
    {
      sum += arr[i] * num--;
    }
    
    System.out.println(sum);
  }
}