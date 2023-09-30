import java.util.*;
import java.io.*;
public class Main
{
    static int t[][];
    static int visited[][];
    static int mx[]={-1,1,0,0};//상하좌우
    static int my[]={0,0,1,-1};
    static int result=0,M,N;
public static void bfs(ArrayList<int[]> gr){
	    Queue<ArrayList<int[]>> q=new LinkedList<>();
	    q.offer(gr);
	    for(int i=0;i<gr.size();i++){
		//익은 토마토가 여러개 들어갈 수 있으므로 ArrayList 안에 좌표 적어서 저장
		// visited 처리
	        visited[gr.get(i)[0]][gr.get(i)[1]]=1;
	    }
	    while(!q.isEmpty()){
	        ArrayList<int[]> z=q.poll();
	        
	        for(int i=0;i<z.size();i++){
	            ArrayList<int[]> n_cal=new ArrayList<>();
	            for(int j=0;j<4;j++){
	                int n_x=z.get(i)[1]+mx[j];
	                int n_y=z.get(i)[0]+my[j];
	                int n_cnt=z.get(i)[2]+1;
			//상하 좌우 움직인 것과 순서를 계산한 것을
			//배열범위와 방문을 체크하여 다시 q에 넣어준다.
	                if(chk_arr(n_x,n_y) && visited[n_y][n_x]==-1){
	                    if(t[n_y][n_x]==0) {
	                        t[n_y][n_x]=1;
	                        visited[n_y][n_x]=1;
	                        n_cal.add(new int[]{n_y,n_x,n_cnt});
	                    }
	                    else { visited[n_y][n_x]=1; continue;}
	                }
	                result=n_cnt;
	            }
	            
	            q.offer(n_cal);
	        }
	    }
	}
	public static boolean chk_arr(int x,int y){
	    if((x>=0 && x<M) && (y>=0 && y<N)) return true;
	    return false;
	}
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        M=Integer.parseInt(st.nextToken());//가로
        N=Integer.parseInt(st.nextToken());//세로
        
        t=new int[N][M];
        visited=new int[N][M];
        ArrayList<int[]> gr=new ArrayList<>();
        // t 이중배열에 값 입력
        int flag=0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                t[i][j]=Integer.parseInt(st.nextToken());
                if(t[i][j]==1){
                    gr.add(new int[]{i,j,0});
                }
                if(t[i][j]==0){ 
		   // 0이 존재하지 않으면 모두 익은 토마토를 넣은 거서이므로 다음과 같이 flag 변수를 이용하여 설정
                    flag=-1;
                }
                visited[i][j]=-1; // 방문안한 것을 -1로 설정
            }
        }
        
        bfs(gr); // 그래프의 초기값 전달

	//bfs를 진행했는데도 t 값이 0인게 있으면 방문을 안했다는 소리
	//즉 막혀있다는 소리이므로 flag를 이용하여 출력값이 달라질 수 있도록 함.
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(t[i][j]==0){
                    flag=1;
                }
            }
        }

        if(flag==0){
            System.out.println(0);
        } 
        else if(flag==1){
            System.out.println(-1);
        }
        else {
	    // 마지막에 한번더 plus함으로 1은 빼주어야한다.
            System.out.println(result-1);
        }
        
	}
}
