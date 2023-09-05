import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        String input;
        int num;
        Set<Integer> a=new HashSet<>();
        
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            input=st.nextToken();
            switch(input){
                case "add":
                    num=Integer.parseInt(st.nextToken());
                    a.add(num);
                    break;
                case "remove":
                    num=Integer.parseInt(st.nextToken());
                    a.remove(num);
                    break;
                case "check":
                    num=Integer.parseInt(st.nextToken());
                    if(a.contains(num)){
                        bw.write(1);
                    } else{
                        bw.write(2);
                    }
                    break;
                case "toggle":
                    num=Integer.parseInt(st.nextToken());
                    if(a.contains(num)){
                        a.remove(num);
                    } else{
                        a.add(num);
                    }
                    break;
                case "all":
                    for(int j=1;j<=20;j++){
                        a.add(j);
                    }
                    break;
                case "empty":
                    a.clear();
                    break;
            }
        }
        bw.flush();
        bw.close();
	}
}