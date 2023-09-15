## 실버2 18870 좌표압축

- 문제유형

  정렬, 좌표압축

- 공부한점

  배열 정렬 라이브러리를 이용해서 문제를 해결하였는데

  다른 정렬 방식의 함수를 만들어서 사용하면 더욱 빠르게 문제를 해결할 수 있다.

  여기서 빠른 정렬이라는 것은 퀵정렬, 합병정렬, 힙정렬과 같은 정렬방식을 말한다.

  나는 여기서 이중배열을 이용해서 풀었는데 map을 이용했으면 더욱 간단하게 풀 수 있었다.

  ```java
  //  	tomato8269님의 코드
   import java.util.*;


  public class Main {
  	
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		StringBuilder sb = new StringBuilder();
  		HashMap<Integer, Integer> hm = new HashMap<>();
  		
  		int n = sc.nextInt();
  		int[] arr = new int[n];
  		int cnt = 0;
  	
  		for(int i=0;i<n;i++) {
  			arr[i] = sc.nextInt();
  			
  		}
  		int[] temp = arr.clone();
  		Arrays.sort(arr);
  		
  		for(int i=0;i<n;i++) {
  			if(!hm.containsKey(arr[i])) {
  				hm.put(arr[i], cnt++);
  			}
  		}
  		for(int i=0;i<n;i++) {
  			sb.append(hm.get(temp[i])).append(" ");
  		}
  		System.out.println(sb);
  	}
  }

  ```


  위의 코드를 참고하자
