## 골드 5 토마토

- 문제유형

 graph, graph search, bfs

- 공부한 점

  ```java
  Queue<ArrayList<int[]>> q=new LinkedList<>();
  //여러개의 시작점이 들어온다고 생각하여 Queue 안에 ArrayList<int[]>를 집어 넣었다.
  Queue<int[]> q=new LinkedList<>();
  // 이렇게 푸는 방법이 훨씬 빠르다.
  ```

 몇 일이 걸리는지 순차적인 날짜가 중요함으로 int[] 배열에 x,y좌표 + 걸리는 날짜를 갖게 히주면 된다.
 
 그렇다면 arrayList를 사용하지 않아도 어떤 좌표값이 어떤날에 익었는지 확인 할 수 있기 때문이다.

 나는 이 두가지를 한번에 사용해 코드가 더 비효율적으로 바뀌었던 것 같다.

 만약 나처럼 풀거 였으면 굳이 int 배열안에 걸리는 날짜를 안줘도 됐었다.
