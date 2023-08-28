import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    int L = Integer.parseInt(br.readLine());
	    int[] S = new int[L];
	    st = new StringTokenizer(br.readLine());
	    for(int i=0;i<L;i++){
	        S[i] = Integer.parseInt(st.nextToken());
	    }
	    int n =  Integer.parseInt(br.readLine());
	    
	    Arrays.sort(S);
	    int flag=0,bottom=0,top=0;
	    for(int i=0;i<L;i++){
	        if(S[i]<n){
	            bottom=S[i];
	        }
	        if(S[i]>n && flag==0){
	            top=S[i];
	            flag=1;
	        }
	        if(n==S[i]){
	            flag=2;
	        }
	    }
	    int result=0;
	    if(flag!=2){
	        if(bottom+1==n){
	            result+=top-n-1;
	        } else {
	            for(int i=bottom+1;i<=n;i++){
	                if(i!=n) result+=top-n;
	                else result+=top-n-1;
	            }
	        }
	    } else result=0;
	    System.out.println(result);
	}
}
