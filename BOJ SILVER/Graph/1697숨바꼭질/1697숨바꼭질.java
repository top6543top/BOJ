import java.util.*;
import java.io.*;
public class Main
{  
    public static int visited[];
    public static int move[] = {-1,1,2};
    public static int n,k;
	public static void bfs(int n){
	    int cnt=-1;
        Queue<Integer> q=new LinkedList<>();
        q.add(n);
        while(!q.isEmpty()){
            int a=q.size();
            cnt++;
            for(int i=0;i<a;i++){
                n=q.poll(); 
                if(visited[n]==0){ // 방문하지 않았다면
                    for(int j=0;j<3;j++){ // move는 3가지
                        int b=0;
                        if(n>k){
                            b=n+move[0];
                            if(b>=0){
                                q.add(b);
                            }
                        }else{
                            if(j<2){
                                b=n+move[j];
                            } else{
                                b=n*move[j];
                            }
                            if(b>=0&&b<100001&&n!=k){
                                q.add(b);
                            }
                        }
                    }
                    visited[n]=cnt;
                }
            }
        }
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();

        visited=new int[100001];
        for(int i=0;i<100001;i++){
            visited[i]=0;
        }
       
        bfs(n);
       
        System.out.println(visited[k]);
	}
}
