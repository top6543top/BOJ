import java.util.*;

public class Main
{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		char input1[] = new char[50];
		char input2[] = new char[50];
		int cnt=0,min=50,b,cnt1=0,cnt2=0 ;
		String a,d;
		a=sc.next();
		for(int i=0;i<a.length();i++){
		    input1[i]=a.charAt(i);
		    cnt1++;
		}
		d=sc.next();
		for(int i=0;i<d.length();i++){
		    input2[i]=d.charAt(i);
		    cnt2++;
		}
		b = cnt2-cnt1;
		for(int i=0;i<=b;i++){
    		for(int j=0; j<cnt1;j++){
    		    if(input2[i+j] != input1[j]){
    		        cnt++;
    		    }
    		}
    		if(cnt<min) min = cnt;
    		cnt = 0;
		}
		System.out.println(min);

	}
}