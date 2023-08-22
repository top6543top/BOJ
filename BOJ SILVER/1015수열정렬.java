import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> P = new ArrayList<Integer>();
		int max=0,max_flag=0;
		int N = Integer.parseInt(br.readLine());
		int flag=N-1;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++){
		    A.add(Integer.parseInt(st.nextToken()));
		    P.add(0);
		}
		while(flag != 0){
		    max=0;
		    for(int i=0;i<N;i++){
		        if(max<=A.get(i)){
		            max=A.get(i);
		            max_flag=i;
		        }
		    }
		    A.set(max_flag,-1);
		    P.set(max_flag,flag);
		    flag--;
		}
		 for(int i=0;i<N;i++){
		    System.out.print(P.get(i)+" ");
		 }
	}
}