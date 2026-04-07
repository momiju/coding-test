import java.util.*;

public class Main{
    static int N, M, V; // 정점의 개수, 간선의 개수, 시작할 정점의 번호
    static int[][] graph;
    static boolean[] visited;
    
    // DFS
    static void dfs(int v){
        visited[v] = true;
        System.out.print(v + " ");
        
        for(int i=1;i<=N;i++){
            if(graph[v][i] == 1 && !visited[i])
                dfs(i);
        }
    }

    // BFS
    static void bfs(int s){
        Queue<Integer> q = new LinkedList<>();

        q.add(s);
        visited[s] = true;
        
        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");
            
            for(int i=1;i<=N;i++){
                if(graph[now][i] == 1 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();
        
        graph = new int[N + 1][N + 1];
        
        for(int i=0;i<M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // 양방향
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        
        // DFS 방문
        visited = new boolean[N + 1];
        dfs(V);

        System.out.println();

        // BFS 방문
        visited = new boolean[N + 1];
        bfs(V);
    }
}