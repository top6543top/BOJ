import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException { 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
	    int dp[][] = new int[41][];
	    int i,j,a;
	    StringBuffer sb = new StringBuffer();
	    for(i=0;i<41;i++){
	        dp[i] = new int[2];
	    }
	    dp[0][0]=1; dp[0][1]=0;
	    dp[1][0]=0; dp[1][1]=1; 
	    for(i=0;i<n;i++){
	        a=Integer.parseInt(br.readLine());
	        for(j=2;j<=a;j++){
	            for(int k=0;k<=1;k++){
    	            dp[j][k]=dp[j-1][k]+dp[j-2][k];
	            }
	        }
	        sb.append(dp[a][0]+" "+dp[a][1]+"\n");
	    }
	    System.out.println(sb);
	}
}
