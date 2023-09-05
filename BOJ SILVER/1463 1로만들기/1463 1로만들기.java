import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int []b= new int[1000001];
        b[1]=0;b[2]=1;
        for(int i=3;i<=a;i++){
            if(i%6==0){
                b[i]=Math.min(b[i-1],Math.min(b[i/3],b[i/2]));
            } 
            else if(i%3==0&&i%2!=0){
                b[i]=Math.min(b[i-1],b[i/3]);
            }
            else if(i%2==0&&i%3!=0){
                b[i]=Math.min(b[i-1],b[i/2]);
            } else {
                b[i]=b[i-1];
            }
            b[i]=b[i]+1;
        }
        System.out.println(b[a]);
	}
}