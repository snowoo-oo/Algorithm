import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static List<Node>[] nodes;
    static boolean[] visited;
    static int max, max_idx;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        nodes = new ArrayList[n+1];
        for(int i=0;i<=n;i++)
            nodes[i] = new ArrayList<>();
        
        for(int i=0;i<n-1;i++)
        {
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            nodes[a].add(new Node(b,c));
            nodes[b].add(new Node(a,c));
        }
        
        visited = new boolean[n+1];
        visited[1] = true;
        dfs(1,0);
        
        visited = new boolean[n+1];
        visited[max_idx] = true;
        dfs(max_idx,0);
        System.out.println(max);
        
    }   
    static void dfs(int idx, int dist)
    {
        if(max < dist)
        {
            max = dist;
            max_idx = idx;
        }
        
        for(Node next : nodes[idx])
        {
            if(!visited[next.data])
            {
                visited[next.data] = true;
                dfs(next.data, dist + next.dist);
            }
        }
    }
}

class Node{
    int data;
    int dist;
    Node(int data, int dist)
    {
        this.data = data;
        this.dist = dist;
    }
}
  
