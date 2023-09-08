import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int num[]=new int[1001];
	    num[1]=1;num[2]=2;
	    for(int i=3;i<=a;i++){
	        num[i]=(num[i-1]+num[i-2])%10007;
	    }
	    System.out.println(num[a]);
	}
}
