import java.util.*;

class Main{
    static void bfs(int[][] arr, int N, int M){
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        qx.offer(0);
        qy.offer(0);

        while(!qx.isEmpty()){
            int x = qx.poll();
            int y = qy.poll();

            // 위
            if(x-1>=0 && arr[x-1][y]==1){
                arr[x-1][y] = arr[x][y] + 1;
                qx.offer(x-1);
                qy.offer(y);
            }

            // 아래
            if(x+1<N && arr[x+1][y]==1){
                arr[x+1][y] = arr[x][y] + 1;
                qx.offer(x+1);
                qy.offer(y);
            }
            
            // 왼
            if(y-1>=0 && arr[x][y-1]==1){
                arr[x][y-1] = arr[x][y] + 1;
                qx.offer(x);
                qy.offer(y-1);
            }

            // 오
            if(y+1<M && arr[x][y+1]==1){
                arr[x][y+1] = arr[x][y] + 1;
                qx.offer(x);
                qy.offer(y+1);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // 배열
        int[][] arr = new int[N][M];

        for(int i=0;i<N;i++){
            String s = sc.next();
            for(int j=0;j<M;j++){
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        
        bfs(arr, N, M);
        System.out.println(arr[N-1][M-1]);
    }
}