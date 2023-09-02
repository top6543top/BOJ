## 실버 3 2579 계단오르기

- 문제 방식
   다이나믹 프로그래밍(DP)

- 공부한 점
  1) 다이나믹 프로그래밍의 목적
      메모리를 사용해서 중복연산을 줄이고 -> 메모리를 사용한다 또하나의 배열이나 자료구조를 만든다

      중복연산을 줄여서 수행속도를 개선한다 -> 연산한 결과를 자료구조에 담는다.
     
  2) 다이나믹 프로그램을 이용해야할 때
      DFS/BFS로 풀 수 있지만 경우가 너무 많을때

      DFS나 BFS로 풀 수 있는 경우의 수의 마지노선은 5*10^6이다.

      -> 경우의 수는 어떻게 도출하느냐? 1번째 줄부터 경우의 수를 구해보고 규칙을 찾는다.


     경우의 수들에 중복적인 연산이 많은 경우

     다이나믹 프로그램을 이용하면 재귀함수를 이용했을 때보다 경우의 수가 줄어 들게 된다.


  ex)
  ```java
    import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int[]a=new int[n+2];
		for(int i=1;i<=n;i++) a[i]=s.nextInt();
		
		int[]d=new int[n+2];
		d[1]=a[1];
		d[2]=a[1]+a[2];
		for(int i=3;i<=n;i++) 
			d[i]=Math.max(d[i-2],a[i-1]+d[i-3])+a[i];
		
		System.out.print(d[n]);
	}
}
  ```

  이런식으로 새로운 d[] 배열을 만들어서 전에 값을 저장해 풀이를 최적화 한다.
