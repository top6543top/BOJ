import java.util.*;
import java.io.*;
public class Main
{

	public static void main(String[] args) throws IOException {
		int input1,input2,flag = 0,j=0,k=0;
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Queue<Integer> queue = new LinkedList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
		input1 = Integer.parseInt(st.nextToken());
		input2 = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= input1;i++){
		    v1.add(i);
		}
		j=input2-1; // 1 2 4 5 6 7
	    for(int i=0;i<input1;i++){
	         while(!v1.isEmpty()){
	            v2.add(v1.get(j));
                v1.remove(j);
                flag++;
                k = j-1;
                j = j-1;
                if(k+input2<v1.size()){
                     j += input2;
                } else {
                    if(flag!=input1){
                     j = (j+input2)%(input1-flag);
                    }
                }
	         }
	    }
	    if(input1 == 1) System.out.print("<" + v2.get(0)+">");
	    else{
	    for(int i=0;i<input1;i++){
            if(i == 0) System.out.print("<" + v2.get(i));
            else if(i == input1-1) System.out.print(", "+v2.get(i)+">");
            else System.out.print(", "+v2.get(i));
	    }
	    }
	}
}