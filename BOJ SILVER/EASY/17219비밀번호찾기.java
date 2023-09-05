import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        HashMap<String,String> password=new HashMap<>();
        
        int i;
        for(i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            password.put(st.nextToken(),st.nextToken());    
        }
        for(i=0;i<b;i++){
            String c=br.readLine();
            if(password.containsKey(c)){
                System.out.println(password.get(c));
            }
        }
	}   
}
