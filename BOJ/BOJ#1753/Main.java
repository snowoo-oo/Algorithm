import java.io.*;
import java.util.*;

public class Main {
    static int n,m, start;
    static List<Edge>[] nodes;
    static int[] dist;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());
        
        dist = new int[n+1];
        nodes = new ArrayList[n+1];
        for(int i=1;i<=n;i++)
        {
            nodes[i] = new ArrayList<>();
            dist[i] = Integer.MAX_VALUE;
        }
        for(int i=0;i<m;i++)
        {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            nodes[a].add(new Edge(b,c));
        }
        
        dijkstra(start);
        
        for(int i=1;i<=n;i++)
        {
            if(dist[i] == Integer.MAX_VALUE)
                System.out.println("INF");
            else
                System.out.println(dist[i]);
        }
	}
    
    static void dijkstra(int start)
    {
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>(new Comparator<Edge>(){
           public int compare(Edge a, Edge b)
           {
               if(a.dist < b.dist) return -1;
               else if(a.dist > b.dist) return 1;
               else return 0;
           }
        });
        pq.add(new Edge(start, 0));
        dist[start] = 0;
        
        while(!pq.isEmpty())
        {
            Edge e = pq.poll();
            int now = e.node;
            int cost = e.dist;
            
            for(int i=0;i<nodes[now].size();i++)
            {
                int next = nodes[now].get(i).node;
                int nCost = nodes[now].get(i).dist;
                
                if(dist[next] > cost + nCost)
                {
                    dist[next] = cost + nCost;
                    pq.add(new Edge(next, dist[next]));
                }
            }
        }
    }
}

class Edge{
    int node;
    int dist;
    Edge(int node, int dist)
    {
        this.node = node;
        this.dist = dist;
    }
}