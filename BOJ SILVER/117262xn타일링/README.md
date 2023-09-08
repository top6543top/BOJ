## 실버 3 11726 2xn타일링

- 문제유형

  다이나믹 프로그래밍

- 공부한 점




- 내가 틀린 점
  
  1)먼저 첫번째로 조합으로 접근했다. 여기서 조합이 안되는 이유는 시간 복잡도가 높기 때문이다.

  ```java
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
    if(r == 0) {
        print(arr, visited, n);
        return;
    } 

    for(int i=start; i<n; i++) {
        visited[i] = true;
        combination(arr, visited, i + 1, n, r - 1);
        visited[i] = false;
      }
  }

  ```

  조합은 재귀함수를 이용함으로 시간 복잡도가 복잡할 수 밖에 없다. 큰 수를 넣으면 너무 시간이 오래걸린다.

  2) 배열 동적할당을 다음과 같이 했다.
 
     ```java
        import java.util.*;
        public class Main
        {
        	public static void main(String[] args) {
        	    Scanner sc=new Scanner(System.in);
        	    int a=sc.nextInt();
        	    int num[]=new int[a+1]; ////이부분
        	    num[1]=1;num[2]=2;
        	    for(int i=3;i<=a;i++){
        	        num[i]=(num[i-1]+num[i-2])%10007;
        	    }
        	    System.out.println(num[a]);
        	}
        }
     ```



     이와 같이 배열을 할당하게 되면 a==2일때 문제가 발생한다. 
  
