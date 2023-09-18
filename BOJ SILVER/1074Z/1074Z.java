import java.util.*;
import java.io.*;
public class Main
{
    public static int result=0,r,c,flag=0;
    public static void cal(int sr,int sc,int row,int col,int flag){//0 0 8 8 0
        if(flag==0 && row>2){
            cal(sr,sc,row/2,col/2,1); //00441
            cal(sr,sc+col/2,row/2,col/2,2); //04442
            cal(sr+row/2,sc,row/2,col/2,3); //40443
            cal(sr+row/2,sc+col/2,row/2,col/2,4); //44444
        }
        else if((r>=sr && r<=sr+row-1) && (c>=sc && c<=sc+col-1)){
            
            if(flag>1){
                 result+=(row*col*(flag-1));
            }
            if(row==2){
                if(c==sc&&r==sr) result+=1;
                if(c==sc+1&&r==sr) result+=2;
                if(c==sc&&r==sr+1) result+=3;
                if(c==sc+1&&r==sr+1) result+=4;
            }
            if(row>2){
                cal(sr,sc,row/2,col/2,1);
                cal(sr,sc+col/2,row/2,col/2,2);
                cal(sr+row/2,sc,row/2,col/2,3);
                cal(sr+row/2,sc+col/2,row/2,col/2,4);
            }
        }
        return;
    }
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int n=Integer.parseInt(st.nextToken());
	    r=Integer.parseInt(st.nextToken());//가로
	    c=Integer.parseInt(st.nextToken());//세로
	    
	    cal(0,0,(int)Math.pow(2,n),(int)Math.pow(2,n),0);
	    if(result>0){
	        System.out.println(result-1);
	    } else {
	        System.out.println(0);
	    }
	}
}