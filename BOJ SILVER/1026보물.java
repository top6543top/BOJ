//우선순위 queue를 사용하면 더 좋은 방식으로 풀 수 있다(Priority Queue)
// B배열을 재배열하지 말라고 했지 정렬된 새 배열을 만들지 말란 말은 없었다
// 이를 고려하면 더 좋은 코드가 나올 수 있었다.
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int input = Integer.parseInt(br.readLine());
		int a[] = new int[input];
		int b[] = new int[input];
		ArrayList<Integer> b_list = new ArrayList<Integer>();
		ArrayList<Integer> a_list = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<input;i++){
		    a[i] = Integer.parseInt(st.nextToken());
		    a_list.add(i,0);
		}
		Arrays.sort(a);
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<input;i++){
		    b[i] = Integer.parseInt(st.nextToken());
		    b_list.add(b[i]);
		}
		int max=0,flag=0,max_flag=0;
		for(int j=0;j<input;j++)
		    max=0;
    		for(int i=0;i<input;i++){
    		    if(b_list.get(i) >= max){ 
    		        // LIST 중현재 남아있는 값 중에 가장 큰 값을 찾는다
    		        max=b_list.get(i); 
    		        max_flag=i;
    		    }
    		}
    		b_list.set(max_flag,-1); // 리스트에서 값을 뺀다는 개념으로 -1을 넣는다
    		a_list.set(max_flag,a[flag]);// 큰값에 작은 A값 넣는다는 개념
    		flag++;
		}
		int result=0;
		for(int i=0;i<input;i++){
	    	result+=a_list.get(i)*b[i];
		}
		System.out.println(result);
	}
}