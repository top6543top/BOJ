import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int tae_su=Integer.parseInt(st.nextToken());
		int P=Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> score = new ArrayList<>();
		int result=1;
		if(N!=0){
    		st = new StringTokenizer(br.readLine());
    		for(int i=0;i<N;i++){
    		    score.add(Integer.parseInt(st.nextToken()));
    		}
    		for(int i=N;i<P;i++){
    		    score.add(0);
    		}
    		for(int i=0;i<P;i++){
    		    if(P>N){
    		        if(score.get(i)<=tae_su){result=i+1; break;}
    		    } else {
    		        if(score.get(N-1)>=tae_su){result=-1; break;}
    		        if(score.get(i)<=tae_su){result=i+1; break;}
    		    }
    		}
		}
		
		System.out.println(result);
	}
}