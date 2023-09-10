import java.util.*;
import java.io.*;
public class Main
{
    static int a[][];
    static int white=0,blue=0;
	public static void chk(int startx,int starty,int size){ // 0 0 4
	    int i,j;
	    boolean flag=false;
	    int b=size/2;
	    for(i=starty;i<starty+size;i++){
	        flag=false;
	        for(j=startx;j<startx+size;j++){
	            if(a[i][j]==a[starty][startx]){
	               flag=false; 
	            } else {
	                flag=true;
	                break;
	            }
	        }
	        if(flag==true){
	           break;
	       }
	    }
	     if(flag==true){
	       if(size!=1){
    	       chk(startx,starty,b);
    	       chk(startx+b,starty,b);
    	       chk(startx,starty+b,b);
    	       chk(startx+b,starty+b,b);
	       }
	     } else {
	       if(a[starty][startx]==1) blue++;
	       else white++;
	     }              
	}
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st;
	    int n=Integer.parseInt(br.readLine());
	    a=new int[n][];
	    int i,j;
	    for(i=0;i<n;i++){
	        a[i]=new int[n];
	    }
	    
	    for(i=0;i<n;i++){
	        st=new StringTokenizer(br.readLine());
	        for(j=0;j<n;j++){
	            a[i][j] =Integer.parseInt(st.nextToken());
	        }
	    }
	    
	    chk(0,0,n);
	    
	    System.out.println(white);
        System.out.print(blue);	    
	}
}