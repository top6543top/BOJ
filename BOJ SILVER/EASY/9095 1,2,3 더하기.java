import java.util.*;
import java.io.*;
public class Main
{   
    public static int result=0;
    public static void cal(int input){
        if(input>0){
            for(int i=1;i<=3;i++){
                cal(input-i);
            }
        }
        if(input==0){
            result=result+1;
        }
    }
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int []input = new int[n];
		
		for(int i=0;i<n;i++){
		    input[i]=Integer.parseInt(br.readLine());
		    cal(input[i]);
		    System.out.println(result);
		    result=0;
		}
	}
}