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
                num[i]=1; //제곱수인 것은 1개로 할당
                s.add(i); //제곱수만 있는 것은 arraylist에 넣는다.
            }else{ // 제곱수가 아닌것들
                for(int j=s.size()-1;j>=0;j--){ // 다이나믹 프로그래밍 알고리즘 이용
                    flag=num[s.get(j)]+num[i-s.get(j)]; // 배열안에 있는 제곱수를 더해주고 그 전에 있는 것 더해준다
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
