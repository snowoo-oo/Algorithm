import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static int[] dy = {1, -1, 0, 0};
    static int[] dx = {0, 0, 1, -1};
    static char[][] map;
    static int[][] visited;
    static int max;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        
        for(int i=0;i<n;i++)
        {
            String tmp = br.readLine();
            for(int j=0;j<m;j++)
            {
                map[i][j] = tmp.charAt(j);
            }
        }
        
        visited = new int[n][m];
        int land_cnt =0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(map[i][j] == 'L')
                {
                    visited = new int[n][m];
                    bfs(i,j);
                }
            }
        }
        System.out.println(max-1);
    }   
    static void bfs(int y,int x)
    {
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(y,x));
        visited[y][x] = 1;
        
        while(!q.isEmpty())
        {
            Pos p = q.poll();
            for(int i=0;i<4;i++)
            {
                int ny = p.y + dy[i];
                int nx = p.x + dx[i];
                if(ny >=0 && nx >=0 && ny < n && nx < m)
                {
                    if(visited[ny][nx]==0 && map[ny][nx] == 'L')
                    {
                        visited[ny][nx] = visited[p.y][p.x] + 1;
                        q.add(new Pos(ny,nx));
                        max = Math.max(max, visited[ny][nx]);
                    }
                }
            }            
        }
    }
}
class Pos{
    int y,x;
    Pos(int y, int x)
    {
        this.y = y;
        this.x = x;
    }
}  
