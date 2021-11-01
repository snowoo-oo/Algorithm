import java.io.*;
import java.util.*;

public class Main {
    static boolean[] selected = new boolean[9];
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());
        while(tc-- >0)
        {
            int n = Integer.parseInt(br.readLine());
            List<Score> list = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list.add(new Score(a,b));
            }
            Collections.sort(list);
            
            int ans = 1;
            int min = list.get(0).b;
            for(int i=1;i<n;i++)
            {
                if(list.get(i).b < min)
                {
                    ans++;
                    min = list.get(i).b;
                }
            }
            System.out.println(ans);
        }
        
	}
}
class Score implements Comparable<Score>{
    int a;
    int b;
    Score(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public int compareTo(Score s)
    {
        if(a < s.a) return -1;
        else if(a > s.a) return 1;
        else return 0;
    }
}