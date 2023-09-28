import java.util.*;
import java.io.*;
public class Main
{
	public static int a[][];
	public static boolean visited[];
	public static int result=0;
	public static void dfs(int start){
	    visited[start]=true;
	    
	    for(int i=1;i<a[start].length;i++){
	        if(a[start][i]==1&&visited[i]==false){
	            dfs(i);
	        }
	    }
	    return;
	}
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int n=Integer.parseInt(st.nextToken());
	    int m=Integer.parseInt(st.nextToken());
	    
	    a=new int[n+1][n+1];
	    visited=new boolean[n+1];
	    for(int i=1;i<n+1;i++){
	        for(int j=1;j<n+1;j++){
	            a[i][j]=0;
	        }
	        visited[i]=false;
	    }
	    
	    int u,v;
	    for(int i=0;i<m;i++){
	        st=new StringTokenizer(br.readLine());
	        u=Integer.parseInt(st.nextToken());
	        v=Integer.parseInt(st.nextToken());
	        a[u][v]=1;
	        a[v][u]=1;
	    }
	    
	    for(int i=1;i<n+1;i++){
	        if(visited[i]==false){
	            dfs(i);
	            result++;
	        }
	    }
	    System.out.println(result);
	}
}
