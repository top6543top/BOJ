import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int i,result=0;
  
        ArrayList<Integer> coin = new ArrayList<>();
        for(i=0;i<N;i++){
            coin.add(Integer.parseInt(br.readLine()));
        }
        i=N-1;
        while(true){
            if(coin.get(i)>K){i=i-1;}
            else {
                K=K-coin.get(i);
                result++;
            }
            if(K==0) break;
        }
       
        bw.write(result+"\n");
        bw.flush();
        bw.close();
	}
}