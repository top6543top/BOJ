import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n=Integer.parseInt(br.readLine());
        int t[][]=new int[n][2];
        
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            t[i][0]=Integer.parseInt(st.nextToken());
            t[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(t, (o1, o2) -> {
             return o1[1]==o2[1]?o1[0]-o2[0]:o1[1]-o2[1];
        });
        int start=t[0][1],cnt=1,result=1;
       while(cnt<n){
           if(start<=t[cnt][0]) {start=t[cnt][1]; result++;}
           cnt++;
       }
       
        System.out.println(result);
	}
}
