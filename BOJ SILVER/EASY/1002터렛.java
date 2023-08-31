import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException {
	    int a;
		int x1,y1,x2,y2,r1,r2,x3,y3,result=0,min,max;
		double r3;
        Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		for(int i = 0; i<a;i++){
    		x1 = sc.nextInt();
    		y1 = sc.nextInt();
    		r1 = sc.nextInt();
    	    x2 = sc.nextInt();
    		y2 = sc.nextInt();
    		r2 = sc.nextInt();
    		r3 = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    		
    		if(r3 > r1 && r3 > r2){
    		    if(r3 < r2+r1) result = 2;
    		    if(r3 == r2+r1) result = 1;
    		    if(r3 > r2+r1) result = 0;
    		} //원이 바깥에 있을때
    		if(r3 == r1 || r3 == r2){
    		    result = 2;
    		}//원의 위에 있을때
    		if(r3 < r1 || r3 < r2){
    		    if(r1 <= r2){min = r1; max = r2;}
    		    else {min = r2; max = r1;}
    		    
    		    if(r3 == 0 && r1 == r2) result = -1;
    		    else {
        		    if(r3+min == max) result = 1;
        		    else if(r3+min > max) result = 2;
        		    else if(r3+min < max) result = 0;
    		    }
    		}
    		
    	    System.out.println(result);
		}
	}
}
