import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int []t = new int[n];
		int result=0,i=0,j=0;
		
		st = new StringTokenizer(br.readLine());
	    for(i=0;i<n;i++){
	        t[i]=Integer.parseInt(st.nextToken());
	    }
	   Arrays.sort(t);
	   for(i=0;i<n;i++){
	       for(j=0;j<=i;j++){
	           result+=t[j];
	       }
	   }
	   System.out.println(result);
	}
}
