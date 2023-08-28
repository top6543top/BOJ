import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int min_6=1000,min_1=1000,result=0;
		
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int[] money_6 = new int[M];
		int[] money_1 = new int[M];
		for(int i=0;i<M;i++){
		    st = new StringTokenizer(br.readLine());
		    money_6[i] = Integer.parseInt(st.nextToken());
		    money_1[i] = Integer.parseInt(st.nextToken());
		    if(money_6[i]<min_6){
		        min_6 = money_6[i];
		    }
		    if(money_1[i]<min_1){
		        min_1=money_1[i];
		    }
		}
		while(N!=0){
    		if(N>=6){
    		    if(min_1*6>=min_6){
    		        result+=min_6;
    		        N=N-6;
    		    }else{
    		        result+=min_1*6;
    		        N=N-6;
    		    }
    		}else{
    		    if(min_1>min_6){
    		        result+=min_6;
    		        N=0;
    		    } else {
    		        result+=min_1;
    		        N--;
    		    }
    		}
		}
		System.out.println(result);
	}
}
