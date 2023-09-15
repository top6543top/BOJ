import java.util.*;
import java.io.*;
public class Main
{
	public static int parents[];
	public static int result=0;
	// 연결해주는 함수 union
	public static void union(int b,int c){
	    int x=find(b); //b의 부모 노드 찾기
	    int y=find(c); //c의 부모 노드 찾기
	    if(x==y) return;  // 연결되어 있다면 return
	    if(x>y) parents[x]=y; // 작은 값이 부모 노드가 되도록
	    else parents[y]=x;
	    result--; // 연결되면 요소가 하나 줄어듬으로 결과 값 --
	    return;
	}
	// 부모노드를 찾는 함수 find
	public static int find(int child){
	    if(parents[child]==child) return child; // 자기 자신이면 리턴
        
	    return find(parents[child]); // 아니면 부모값 찾아간다
	}
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()); //정점의 개수 
        int m=Integer.parseInt(st.nextToken()); //간선의 개수
        parents=new int[n+1];
        for(int i=1;i<n+1;i++){
            parents[i]=i;
        }
        result=n;
        int b,c;
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            b=Integer.parseInt(st.nextToken());
            c=Integer.parseInt(st.nextToken());
            union(b,c);
        }
        
        System.out.println(result);        
	}
}