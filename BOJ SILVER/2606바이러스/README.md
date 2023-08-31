## 실버3 2606바이러스

- 문제 풀이 방식
  그래프,DFS

- 공부한 점
  1) 그래프 구현방식
      1. 인접그래프
        ```c
        public static void main(String[] args) {
		int[][] edges = new int[][] {
			{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 5}, {4, 5}
		};
		
		int n = 5; //정점의 개수
		
		int[][] matrix = new int[n + 1][n + 1];
		
		for(int[] edge : edges) {
			matrix[edge[0]][edge[1]] = 1;
			matrix[edge[1]][edge[0]] = 1;
		}
		
        //출력
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	  }
	  ```
  
        - 이중배열을 통해 어디에 연결되어 있는지 표기


      2. 인접리스트
  
        ```c
         public static void main(String[] args) {
        		int[][] edges = new int[][] {
        			{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 5}, {4, 5}
        		};
        		
        		int n = 5;
        		
        		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        		
        		for(int i = 0 ; i <= n ; i++) list.add(new ArrayList<>());
        		
        		for(int[] edge : edges) {
        			list.get(edge[0]).add(edge[1]);
        			list.get(edge[1]).add(edge[0]);
        		}
        		
                //출력
        		for (int i = 1; i < list.size(); i++) {
        			for(int j = 0 ; j < list.get(i).size(); j++) 
        				System.out.print(list.get(i).get(j)+" ");
        			System.out.println();
        		}
        	}
    		   ```
  
        - ArrayList안에 또다른 ArrayList 생성으로 각 노드에 어떻게 연결되어 있는지 표시
  
          ArrayList<Integer>[] list = new ArrayList[n + 1]; 이런 방식으로 구현가능
  
  2) 탐색방식
     1. DFS(스택방식 FILO이용)
        
        ```c
        static void dfs(int nodeIndex) {
		// 방문 처리
		vistied[nodeIndex] = true;
		
		// 방문 노드 출력
		System.out.print(nodeIndex + " -> ");
		
		// 방문한 노드에 인접한 노드 찾기
		for (int node : graph[nodeIndex]) {
			// 인접한 노드가 방문한 적이 없다면 DFS 수행
			if(!vistied[node]) {
				dfs(node);
			}
		}
	}
        ```

      이런식으로 재귀함수를 통해 방문하지 않은 노드를 찾아가는 방법이 있고

  ```c
  public static void main(String[] args) {
		
		// 시작 노드를 스택에 넣어줍니다.
		stack.push(1);
		// 시작 노드 방문처리
		vistied[1] = true;
		
		// 스택이 비어있지 않으면 계속 반복
		while(!stack.isEmpty()) {
			
			// 스택에서 하나를 꺼냅니다.
			int nodeIndex = stack.pop();
			
			// 방문 노드 출력
			System.out.print(nodeIndex + " -> ");
			
			// 꺼낸 노드와 인접한 노드 찾기
			for (int LinkedNode : graph[nodeIndex]) {
				// 인접한 노드를 방문하지 않았을 경우에 스택에 넣고 방문처리 
				if(!vistied[LinkedNode]) {
					stack.push(LinkedNode);
					vistied[LinkedNode] = true;
				}
			}
		}
	}
  ```

  이런식으로 첫노드를 스택에 넣은 다음 스택에서 꺼내고 넣음으로써 DFS를 수행하는 방법이 있다.

  2. BFS(Queue FIFO이용)
     
     ```c
      int start = 1; // 시작 노드
        // 큐 구현
        Queue<Integer> queue = new LinkedList<>();
            queue.add(start);
            
            // 현재 노드를 방문 처리
            visited[start] = true;
            
            // 큐가 빌때까지 반복
            while(!queue.isEmpty()){
                // 큐에서 하나의 원소를 뽑아 출력
                int v = queue.poll();
                System.out.println(v + " ");
                
                // 인접한 노드 중 아직 방문하지 않은 원소들을 큐에 삽입
                for (int i : graph[v]){
                    if (visited[i] == false){
                        queue.add(i);
                        visited[i] = true;
                    }
                }
     ```

     시작 노드를 집어 넣고 그 주위에 있는 노드들을 큐에 집어 넣은다음 진행한다.
