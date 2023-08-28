import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		Set<String> set = new HashSet<>();
		String[] no_listen = new String[N];
		String[] no_see = new String[M];
		ArrayList<String> result = new ArrayList<>();
		
		int i;
		for(i=0;i<N;i++){
		   no_listen[i]=br.readLine();
		   set.add(no_listen[i]);
		}
		for(i=0;i<M;i++){
		    no_see[i]=br.readLine();
		       if(set.contains(no_see[i])){
		           result.add(no_see[i]);
		       }
		}
		Collections.sort(result);
		System.out.println(result.size());
		for(i=0;i<result.size();i++){
		    System.out.println(result.get(i));
		}
	}
}