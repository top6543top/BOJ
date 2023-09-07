import java.util.*;
import java.io.*;
public class Main
{
	static ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	static boolean visited_dfs[],visited_bfs[];
	static StringBuilder dfs_str=new StringBuilder();
	static StringBuilder bfs_str=new StringBuilder();
	public static void dfs(int v){
	    visited_dfs[v]=true;
	    dfs_str.append(v+" ");
	    for(int i: list.get(v)){
	        if(!visited_dfs[i]){
	            dfs(i);
	        }
	    }
	}
	public static void bfs(int v){
	    Queue<Integer> q = new LinkedList<Integer>();
	    visited_bfs[v]=true;
	    q.add(v);
	    while(q.size()!=0){
	        v=q.poll();
	        bfs_str.append(v+" ");
	        for(int i:list.get(v)){
	            if(!visited_bfs[i]){
	                visited_bfs[i]=true;
	                q.add(i);
	            }
	        }
	    }
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int v=Integer.parseInt(st.nextToken());
		
		int i;
		for(i=0;i<=n;i++) {list.add(new ArrayList<>());}
		visited_dfs = new boolean [n+1];
		visited_bfs = new boolean [n+1];
		for(i=0;i<=n;i++){
		    visited_dfs[i]=false;
		    visited_bfs[i]=false;
		}
		
		int a,b;
		for(i=0;i<m;i++){
		    st=new StringTokenizer(br.readLine());
		    a=Integer.parseInt(st.nextToken()); b=Integer.parseInt(st.nextToken());
		    list.get(a).add(b);
		    list.get(b).add(a);
		}
		for(i=1;i<list.size();i++){
		    Collections.sort(list.get(i));
		}
        dfs(v);
        bfs(v);
        System.out.println(dfs_str);
        System.out.println(bfs_str);
	}
}