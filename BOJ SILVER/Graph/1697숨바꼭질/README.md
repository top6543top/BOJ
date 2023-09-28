## 실버1 1697 숨바꼭질

- 문제유형

  그래프, 그래프 탐색, 다이나믹 프로그래밍

- 공부한점

  그래프 탐색 뿐만아니라 다이나믹 프로그래밍을 이용하여 풀 수 도 있다.


  ```java
  //	mj1ees님의 코드
  public class Main {
      private static int n;
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st = new StringTokenizer(br.readLine());
          n = Integer.parseInt(st.nextToken());
          int k = Integer.parseInt(st.nextToken());
          System.out.println(dfs(k));
      }
  
      private static int dfs(int k) {
          if (n >= k) return n - k; // n이 더 크면 -만 가능하므로 다음값 리턴
          if (k == 1) return 1;
          if( k % 2 == 1 ) return 1 + Math.min(dfs(k + 1), dfs(k-1));
          return Math.min(1 + dfs(k / 2), k - n);
      }
  }
  ```

  다음 코드와 같이 결국 기존의 값을 이용하여 풀 수도 있다. 
  
- 내가 잘못한 점

  그래프 문제라고 그래프를 직접 만들 필요는 없다.


  ```java
  public static void make_graph(int cnt){
	    if(a.get(cnt).size()>0) return;
	    if(cnt>=2*k || cnt<=0){
	        return;
	    } else {
    	    if(cnt<k){
    	        a.get(cnt).add(cnt-1);
    	        a.get(cnt).add(cnt+1);
    	        a.get(cnt).add(cnt*2);
    	        
    	        make_graph(cnt-1);
    	        make_graph(cnt+1);
    	        make_graph(cnt*2);
    	    } else if(cnt>k){
    	        a.get(cnt).add(cnt-1);
    	        make_graph(cnt-1);
    	    }
	    }
	    return;
	}
  ```

  기존에 함수를 이용해서 이와 같이 그래프를 만든 뒤 탐색을 진행했었는데

  굳이 만들 필요 없이 내가 푼 해설 처럼 바로 bfs로 들어가서 거기서 queue에 값을 넣고 탐색하면 되는 문제다.


  ** 탐색하면서 방문한 노드를 또 방문한 경우를 계산하여 두경우를 비교해서 최소값을 입력해주려 했었는데, 생각해보면 그럴필요 없다

  bfs이므로 거기서 다음 경우로 가는 경우를 생각할 것이기 때문이다.
