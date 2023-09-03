import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
	    String a,b;
	    int result=1;
	    for(int j=0;j<n;j++){
	         HashMap<String, String> map1 = new HashMap<String, String>();
	        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
	        result=1;
	        int m=Integer.parseInt(br.readLine());
    	    for(int i=0;i<m;i++){
    	        st=new StringTokenizer(br.readLine());
    	        a=st.nextToken(); b=st.nextToken();
    	        map1.put(a,b);
    	        if(map2.containsKey(b)){
                    map2.put(b,map2.get(b)+1);
    	        } else {
    	            map2.put(b,1);
    	        }
    	    }
        	for(String key:map2.keySet()){
        	  result*=(map2.get(key)+1);
        	}
        	result-=1;
    	 
    	    System.out.println(result);
	    }
	}
}