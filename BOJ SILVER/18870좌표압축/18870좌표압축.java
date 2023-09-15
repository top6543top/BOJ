import java.util.*;
import java.io.*;
public class Main
{

	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int xy[][]=new int[n][2];
        int z[]=new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            xy[i][0]=i;
            xy[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xy,(o1,o2)->{
            return o1[1]-o2[1];
        });
        int cnt=0; z[0]=cnt;
        for(int i=0;i<n-1;i++){
            if(xy[i][1]!=xy[i+1][1]){ 
               cnt+=1;
            }
            z[i+1]=cnt;
        } 
        for(int i=0;i<n;i++){
            xy[i][1]=z[i];
        } 
        Arrays.sort(xy,(o1,o2)->{
           return o1[0]-o2[0];
        });

        for(int i=0;i<n;i++){
            bw.write(xy[i][1]+""+" ");
        }
        bw.flush();
        bw.close();
	}
}