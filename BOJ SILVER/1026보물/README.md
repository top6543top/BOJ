## 실버 3 1026 보물

- 문제 유형

  배열 정렬, 우선순위 큐

- 공부한 점

  배열을 단순히 정렬해서 푸는게 일반적인 풀이방법이지만 좋은 풀이를 찾아보다가

  우선순위 큐를 이용할 수 있다는 것도 알게 되었다

  ---

  - 우선순위 큐란?

  Priority Queue는 Queue와 구조가 비슷합니다

  Queue는 FIFO(First In First Out)구조로 먼저들어온 순서대로 데이터가 나가게 되지만 Priority Queue란 데이터의 우선순위를 정해 우선순위가 높은 순서대로 나가게된다.
  
  우선순위 큐는 우선순위 힙으로 구현을 할 수 있다
  
  데이터를 삽입할 때 우선순위의 최대, 최소를 구성하여 데이터가 빠지면 중간을 계속해서 채워넣는 방식이다.

  이진 트리 형식으로 구성되어 있다.

  ---

  
  # PriorityQueue<Integer> pq = new PriorityQueue<>();

  이런식으로 선언해서 add(offer),remove(poll) 과 같은 명령어를 이용하여 사용하며

  pq.remove() 하면 우선순위에 따라 값이 나오게 된다.

  이 우선순위 큐는 커스텀 해서 나만의 우선순위를 만들어 사용할 수 있다.



  ```java
    class Gillog implements Comparable<Gillog> {
    
        private int writeRowNumber;
        private String content;
    
        public Gillog(int writeRowNumber, String content) {
            this.writeRowNumber = writeRowNumber;
            this.content = content;
        }
    
        public int getWriteRowNumber() {
            return this.writeRowNumber;
        }
    
        public String getContent() {
            return this.content;
        }
    
        @Override
        public int compareTo(Gillog gillog) {
    
            if (this.writeRowNumber > gillog.getWriteRowNumber())
                return 1;
            else if (this.writeRowNumber < gillog.getWriteRowNumber())
                return -1;
            return 0;
        }
    }
  ```



  방식은 클래스에서 Comparable<클래스 이름> 을 상속해주고 compareTo를 오버라이딩하여 우선순위를 커스텀하면 된다.
