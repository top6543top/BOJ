import java.io.*;
import java.util.*;
public class Main
{
    public static int n,m;
    public static int a[][];
    public static int visited[][];
    
    public static void bfs(int s_col,int s_row){ 
        Queue<Integer[]> q=new LinkedList<>();
        Integer z[]=new Integer[2];
        z[0]=s_col; z[1]=s_row;
        q.offer(z);
        int result=0;
        visited[z[0]][z[1]]=result;
        
        int cal[]={-1,0,1};
        int n_col,n_row;
        while(!q.isEmpty()){
            int cnt=q.size();
            result++;
            
            for(int k=0;k<cnt;k++){
                Integer[] node=q.poll(); 
                //a의 값이 0이면 탐색안함.
                if(a[node[0]][node[1]]==0) {continue;}
  

                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        // 좌우 상하 탐색하기 위해 반복문 사용
                        n_col=node[0]+cal[i];
                        n_row=node[1]+cal[j];
                        if(i==j){continue;}
                        if(i==0 && j==2 || i==2 && j==0){continue;}
                        //chk_arr함수를 이용해 배열 범위 확인, 방문했는지 확인
                        if(chk_arr(n_col,n_row) && visited[n_col][n_row]==-1){
                            visited[n_col][n_row]=result;
                            Integer[]x={n_col,n_row};
                            q.offer(x);
                        }
                    }
                }
            }
            
            
            
        }
    }
    public static boolean chk_arr(int col,int row){
        if((col<=n&&col>0)&&(row<=m&&row>0)) return true;
        return false;
    }
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken()); // 세로
        m=Integer.parseInt(st.nextToken()); // 가로
        
        a=new int[n+1][m+1];
        visited=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                visited[i][j]=-1;
            }
        }//방문 안한 구간은 -1로 초기화
        
        int col=0,row=0;
        for(int i=1;i<n+1;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<m+1;j++){
                a[i][j]=Integer.parseInt(st.nextToken());
                //특수경우
                if(a[i][j]==2) {col=i; row=j;} // 2는 출발지점이므로 따로 설정
                if(a[i][j]==0) {visited[i][j]=0;} // 0인 지점은 벽으로 미리 설저어
            }
        }
        
        bfs(col,row);
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                bw.write(visited[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
	}
}