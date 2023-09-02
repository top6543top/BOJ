import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int input[] = new int[n+1];
		int go_1[]= new int[n+1];
		int go_2[]= new int[n+1];
		for(int i=1;i<n+1;i++){ // 10 20 15 25 10 20
		    go_2[i]=0;
		    go_1[i]=0;
		    input[i]=Integer.parseInt(br.readLine()); 
		}
		go_2[0]=0;
		go_1[0]=0;
		
		int a,b;
		int cnt=0,result=0;
		for(int i=1;i<n+1;i++){
		    if(i==1){
		        go_1[i]+=input[i];
		        go_2[i]=0;
		    } else {
		        go_2[i]=Math.max(go_1[i-2],go_2[i-2]);
		        if(cnt<1){
    		        go_1[i]=Math.max(go_1[i-1],go_2[i-1]);
		        } else {
		            go_1[i]=go_2[i-1];
		        }
		        go_2[i]+=input[i];
		        go_1[i]+=input[i];
		        cnt++;
		    }
		    a=go_1[i];
		    b=go_2[i];
		}
		System.out.println(Math.max(go_1[n],go_2[n]));
	}
}