import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int ji_min=Integer.parseInt(st.nextToken());
		
		int han_su=Integer.parseInt(st.nextToken());
		int max=N,result=1;
		
		while(true){
		    
		    if(ji_min%2==1){
		        if(ji_min+1 == han_su){
		            break;
		        }
		    }
		    if(han_su%2==1){
		        if(han_su+1 == ji_min){
		            break;
		        }
		    }
		    
    		if(ji_min%2==1) {ji_min=(ji_min+1)/2;}
    		else {ji_min=ji_min/2;}
    		
    		if(han_su%2==1) {han_su=(han_su+1)/2;}
    		else {han_su=han_su/2;}
    		result++;
		}
		System.out.println(result);
	}
}