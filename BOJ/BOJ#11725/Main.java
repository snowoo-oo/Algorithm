import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static boolean[] visited;
    static Node[] nodes;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        n = new Integer.parseInt(br.readLine());
        nodes = new Node[n+1];
        visited = new boolean[n+1];
        
        for(int i=1;i<=n;i++)
        {
            nodes[i] = new Node(i);
        }
        
        for(int i=0;i<n-1;i++)
        {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            nodes[a].leaf.add(nodes[b]);
            nodes[b].leaf.add(nodes[a]);
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(nodes[1]);
        visited[1] = true;
        
        while(!q.isEmpty())
        {
            Node now = q.poll();
            for(Node next : now.leaf)
            {
                if(!visited[next.data])
                {
                    visited[next.data] = true;
                    next.root = now.data;
                    q.add(next);
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            sb.append(nodes[i].root).append('\n');
        }
        System.out.println(sb);
    }
}

class Node{
    int root;
    int data;
    List<Node> leaf;
    Node(int data)
    {
        this.data = data;
        root = 0;
        leaf = new ArrayList<>();
    }
}