import java.util.*;
import java.io.*;
public class Main
{
    //시간 복잡도로 인해 에라토스테네스의 채 사용
    //소수 구하는 법은 두가지가 존재하는데 에라토스테네스의 채,
    //나눠지는 수를 모두 구하는 방법, 시간 복잡도로 인해 채 사용
	public static void main(String[] args) throws IOException {
		int input1,input2,j;
		String result ="";
        int num[] = new int[1000001];
       
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
		input1 = Integer.parseInt(st.nextToken());
		input2 = Integer.parseInt(st.nextToken());

		for(int i = 1; i<num.length;i++){
		    num[i] = 0;
		}
        num[1]=1;
		for(int i=2;i<=Math.sqrt(input2);i++){
		    for(j = i;j<=input2;j=j+i){
		        num[i+j]=1;
		    }
		} //2의 배수 제외, 3의 배수 제외 와 같은 방법을 이용하여 소수 걸러냄
		num[2]=0;
		for(int i=input1;i<=input2;i++){
		    if(num[i] == 0) {
		        result = Integer.toString(i); 
		        bw.write(result + "\n");
		        
		    }
		}
        bw.flush();
        bw.close();
	}
}