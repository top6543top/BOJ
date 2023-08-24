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
		double x[] = new double[3];
		double y[] = new double[3];
		double []length = new double[3];
		double result=0;
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<3;i++){
		    x[i]=Double.parseDouble(st.nextToken());
		    y[i]=Double.parseDouble(st.nextToken());
		}
		
		double a=(y[0]-y[1])/(x[0]-x[1]);
		double b=(y[0]-y[2])/(x[0]-x[2]);
		double c=(y[1]-y[2])/(x[1]-x[2]);
		
		if(a==b||b==c||Double.isNaN(a)||Double.isNaN(b)||Double.isNaN(c)){
		    result=-1.0;
		} else {
    		for(int i=0;i<3;i++){
    		    length[i]=Math.sqrt(Math.pow(x[i%3]-x[(i+1)%3],2)+Math.pow(y[i]-y[(i+1)%3],2));
    		} 
    		
    		Arrays.sort(length);
    		result = length[2]*2-length[0]*2;
		}
		System.out.println(result);
	}
}