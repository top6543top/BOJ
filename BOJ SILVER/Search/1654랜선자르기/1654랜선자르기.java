import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main
{
    public static long []k_line;
    public static boolean check(long mid,int n){
        int cnt=0;
        for(int i=0;i<k_line.length;i++){
            cnt+=k_line[i]/mid;
        }
        if(cnt>=n) {return true;}
       
        return false;
    }
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int k=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(st.nextToken());
        k_line=new long[k];
        long max=0;
        for(int i=0;i<k;i++){
            k_line[i]=Integer.parseInt(br.readLine());
            max=Math.max(max,k_line[i]);
        }
        
        long start=1,end=max;
        int cnt=0;
    
        while(start<=end){
            long mid=(start+end)/2;
            if(check(mid,n)){
                start=mid+1;
                //만약 조건에 해당하는 값을 찾았다면 최대값을 찾아야 함으롤
                //그 조건보다 큰 부분에서 다시 이진 탐색
            } else {
                end=mid-1;
                //만약 조건에 해당하지 않으면 그보다 작은 구간에서 이진탐색
            }
        }
        
       
        System.out.println(start-1);
	}
}