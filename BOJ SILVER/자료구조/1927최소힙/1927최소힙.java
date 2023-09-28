import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    PriorityQueue<Integer> p=new PriorityQueue<>();
	    StringBuilder sb=new StringBuilder();
	    int n=Integer.parseInt(br.readLine());
	    
	    int a;
	    for(int i=0;i<n;i++){
	        a=Integer.parseInt(br.readLine());
	        if(a!=0){
	            p.add(a);
	        } else {
	            if(p.peek()!=null){
	                sb.append(p.poll()).append("\n");
	            } else {
	                sb.append(0).append("\n");
	            }
	        }
	    }
	    System.out.println(sb);
	    
	}
}
