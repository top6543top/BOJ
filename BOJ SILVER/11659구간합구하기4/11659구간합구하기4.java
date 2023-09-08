import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); int b=sc.nextInt();
		int num[]=new int[a+1];
		int sum_num[]=new int[a+1];
		
		int i;
		for(i=1;i<=a;i++){
		    num[i]=sc.nextInt();
		}
		for(i=1;i<=a;i++){
		    sum_num[i]=sum_num[i-1]+num[i];
		}
		int c,d;
		for(i=0;i<b;i++){
		    c=sc.nextInt(); d=sc.nextInt();
		    System.out.println(sum_num[d]-sum_num[c-1]);
		}
	}
}
