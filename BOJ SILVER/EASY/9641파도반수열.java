import java.util.*;
import java.io.*;
public class Main
{
    static long P[] = new long[101];
	public static void main(String[] args) throws IOException { 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		P[1]=1; P[2]=1; P[3]=1; P[4]=2; P[5]=2;
		int input;
		for(int i=0;i<n;i++){
		    input=Integer.parseInt(br.readLine());
		    for(int j=6;j<=input;j++){
		        P[j]=P[j-5]+P[j-1];
		    }
		    System.out.println(P[input]);
		}
	}
}
