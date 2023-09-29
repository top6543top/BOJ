## 실버 1 14940 쉬운최단거리

- 문제 유형

  그래프, BFS

- 공부한 점

  코드를 조금 더 간결화 하는 법을 고민해야 할 것 같다. 접근 방식은 어느정도 맞았다.

  그리고 queue 안에 Integer가 아닌 int가 들어갈 수 있다. 객체만 들어가야 한다는 생각에

  Integer을 넣었는데 int[] 배열이라 상관 없는 듯하다.

  ```java
            for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        // 좌우 상하 탐색하기 위해 반복문 사용
                        n_col=node[0]+cal[i];
                        n_row=node[1]+cal[j];
                        if(i==j){continue;}
                        if(i==0 && j==2 || i==2 && j==0){continue;}
                        //chk_arr함수를 이용해 배열 범위 확인, 방문했는지 확인
                        if(chk_arr(n_col,n_row) && visited[n_col][n_row]==-1){
                            visited[n_col][n_row]=result;
                            Integer[]x={n_col,n_row};
                            q.offer(x);
                        }
                    }
                }
            }
  ```


  이 부분에서 상하좌우 탐색을 다른 방식으로 해본다면

  ```java
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    for (int i = 0; i < 4; i++) {
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
    }
  ```

  이런식으로 잡다한 조건없이 배열로 처리 했으면 코드가 더욱 간결했을 것이다.

  ```java
    if (x > -1 && x < n && y > -1 && y < m) {
                    if (!visited[x][y] && graph[x][y] != 0) {
                        queue.add(new int[]{x, y, now[2] + 1});
                        graph[x][y] = now[2] + 1;
                        visited[x][y] = true;
                    }
     }
  ```

  전역변수 result를 사용하게 되면 내 코드에서 보이는 것처럼 부모노드의 자식노드의 개수만큼 즉, q.size() 만큼 반복문을 돌려야한다.

  하지만 자신의 값을 queue안의 배열에 넣고 다음 값에 더해서 저장해 주면 또다른 반복문을 사용하지 않고도 간결하게 코드를 정리할 수 있다.

  그리고 긴 출력을 적을때는 StringBuilder 을 사용하자.-> 사용 전 속도 1020ms ,사용 후 속도 868
  
