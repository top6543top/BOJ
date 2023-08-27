import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i,j;
		
		String []student = new String[N];
		for(i=0;i<N;i++){
		    student[i] =br.readLine();
		}
		
		int len=student[0].length();
		int a=1,flag=0,result=0,flag2=0;
		while(true){
    		for(i=0;i<N;i++){
    		    for(j=i+1;j<N;j++){
    		        if(student[i].substring(len-a).equals(student[j].substring(len-a))){
                        flag++;
    		        }
    		    }
    		    if(flag>0){break;}
    		}
    		if(flag>0){
    		    a++;
    		    flag=0;
    		} else {
    		    result=a;
    		    break;
    		}
		}
		System.out.println(result);
	}
}