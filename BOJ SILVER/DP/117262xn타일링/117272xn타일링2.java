import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int num[]=new int[1001];
		num[1]=1;num[2]=3;
		for(int i=3;i<=a;i++){
		    num[i]=(num[i-1]+2*num[i-2])%10007;
		}
		System.out.println(num[a]);
	}
}
