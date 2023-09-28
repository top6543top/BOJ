## 실버 3 1로 만들기

- 문제유형

   다이나믹 프로그래밍

- 공부한점
  
  다이나믹 프로그래밍을 통해 경우의 수를 줄여 효율적으로 프로그래밍 하는 방법 터득

  다이나믹 프로그래밍은 재귀 함수 or 배열을 통해 풀 수 있는데 배열로 문제 해결

  백준의 제출된 코드를 활용하여 내가 제출한 코드보다 간략화 해봄




  ```java
  import java.util.*;
  import java.io.*;
  public class Main
  {
  	public static void main(String[] args) throws IOException {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int a=Integer.parseInt(br.readLine());
          int []b= new int[1000001];
          b[1]=0;b[2]=1; 
          for(int i=3;i<=a;i++){
             b[i]=Math.min(b[i/3]+i%3+1,b[i/2]+i%2+1);
          }
          System.out.println(b[a]);
  	}
  }
  ```




  기존의 코드와 다른 점은 조건의 간략화이다. 기존에는 나눠지는 수를 조건문을 통해 경우를 나누었지만

  이 방식은 결국 나누기가 빼기보다 우선시 되므로 빼기를 먼저 진행하고 나누기를 진행하는 경우로 생각하여

  빼기를 더해줬다.



  ```java
  D[i] = i%2==0?Math.min(D[i],D[i/2]+1):D[i];
	D[i] = i%3==0?Math.min(D[i],D[i/3]+1):D[i];
  ```



  조건으로는 이렇게 삼항연산자도 사용 가능


  재귀함수로 풀이하면 프로그램 속도가 1/2정도로 줄어든다. 재귀 함수에서 줄어드는 숫자와 그 전의 가짓수를 넣어 주는 방식이다



  ```java
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.IOException;
     
    public class Main {
    	public static void main(String[] args) throws IOException{
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    		int N = Integer.parseInt(br.readLine());
    		System.out.println(recur(N,0));
    	}
    
    	static int recur(int N, int count){
    		if(N<2){
    			return count;
    		}
    		return Math.min(recur(N/2, count+1+(N%2)), recur(N/3, count+1+(N%3)));
    	}
    }
  ```
