import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
        int num[] = new int[50001];
        ArrayList<Integer> s=new ArrayList<>();
        int min=0,b=0,flag=0;
        for(int i=1;i<=a;i++){
            if(Math.sqrt(i)==Math.floor(Math.sqrt(i))){
                num[i]=1;
                s.add(i);
            }else{
                for(int j=s.size()-1;j>=0;j--){
                    flag=num[s.get(j)]+num[i-s.get(j)];
                    if(j==s.size()-1){min=flag;}
                    else {
                        if(min>flag){min=flag;}
                    }
                }
                num[i]=min;
            }
        }
	    System.out.println(num[a]);
	}
}