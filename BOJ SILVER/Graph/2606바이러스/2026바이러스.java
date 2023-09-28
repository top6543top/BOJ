import java.util.*;
import java.io.*;

public class Main
{     
      public static int result=0;
      
	  public static void dfs(int v,boolean[] visited,ArrayList<ArrayList<Integer>> graph){
        visited[v] = true;
        
        result++;
        for (int i : graph.get(v)){
            if (visited[i]==false){
                dfs(i,visited,graph);
            }
        }
    }
    
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int i,a,b;
        int n = Integer.parseInt(br.readLine());
        int v = Integer.parseInt(br.readLine());
        
        //ArrayList 안에 ArrayList를 만듬으로 서 노드를 간선으로 연결
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (i = 0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }
        //양방향 그래프임으로 양쪽다 배열에 넣어줌.
        for(i=0;i<v;i++){
            st = new StringTokenizer(br.readLine());
            a=Integer.parseInt(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        int start=1; // 시작점이 1이라고 문제에서 지정
        boolean[] visited = new boolean[n+1];
        for(i=0;i<=n;i++){
            visited[i]=false;
        } 
        // 보통 문제에서는 visited을 전역변수 static으로 선언하는데 내부에서 선언
        
        dfs(start,visited,graph);
        // 1자기자신도 포함됨으로 -1 해줌
        System.out.println(result-1);
	}
}
