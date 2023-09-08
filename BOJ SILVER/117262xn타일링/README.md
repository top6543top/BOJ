## 실버 3 11726 2xn타일링

- 문제유형

  다이나믹 프로그래밍

- 공부한 점

  다이나믹 프로그래밍에서 중요한 점은 규칙성을 파악하고 점화식을 잘 사용하는 것이다.

  이 문제에서의 점화식은 D(n)=D(n-1)+D(n-2)였다. 이유는 현재의 방법을 구하는 것은 기존의 것의 옆에 붙이는 방법 밖에는 없기 때문이다.

  양 옆에 붙이는 것은 고려 안해 줘도 된다. 그 이유는 붙여보면 안다....

  다이나믹 프로그래밍을 사용하는 조건은 다음과 같다.

  1) Overlapping Subproblems(겹치는 부분 문제)

    DP는 기본적으로 문제를 나누고 그 문제의 결과 값을 재활용해서 전체 답을 구한다. 그래서 동일한 작은 문제들이 반복하여 나타나는 경우에 사용이 가능하다.

  2) Optimal Substructure(최적 부분 구조)
 
    전의 결과가 다음의 결과를 낼 때에도 최적의 정답이 된다는 조건이 존재해야한다.


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
  
