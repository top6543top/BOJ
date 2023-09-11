## 실버 2 1927 최소힙

- 문제유형

  자료구조, 우선순위 큐

- 공부한 점

  먼저 내가 풀이한 방식에 문제는 없다. priorityqueue를 이용해서 풀면되는데, 더 빠른 방식이 존재하여 추가적으로 공부해봤다.

  일단 기본적으로 priorityqueue의 메소드로는

  
  ```java
  // 첫번째 값을 반환하고 제거 비어있다면 null
  priorityQueueLowest.poll();
  
  // 첫번째 값 제거 비어있다면 예외 발생
  priorityQueueLowest.remove(); 
  
  // 첫번째 값을 반환만 하고 제거 하지는 않는다.
  // 큐가 비어있다면 null을 반환
  priorityQueueLowest.peek();
  
  // 첫번째 값을 반환만 하고 제거 하지는 않는다.
  // 큐가 비어있다면 예외 발생
  priorityQueueLowest.element();
  
  // 초기화
  priorityQueueLowest.clear();    
  ```

  
  이렇게 존재한다.

  heap클래스를 이용하여 직접 우선순위 큐를 구현가능한데 , 이 과정을 공부하며 제네릭을 공부하였다.

  1) 제네릭

      데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법

     ex) ArrayList<Integer> list1 = new ArrayList<Integer>(); 와 같이 쓰이고 외부에서 타입을 지정해주는 형식이다.

     제네릭의 타입으로는 <T>,<E>,<K>,<V>,<N> 이 존재한다. 뭐가 들어가도 상관 없지만 통상적으로 이렇게 쓰인다고 한다.

     
    ```java
      public class ClassName <T> { ... }
      public interface InterfaceName <T> { ... }
      public class ClassName <T, K> { ... }
      public interface InterfaceName <T, K> { ... }
      public class HashMap <K, V> { ... }
    ```

    
     클래스나 인터페이스에선 이렇게 생성한다고 한다.








   ```java
       public <T> T genericMethod(T o) {	// 제네릭 메소드
        }
       ```



      




      메소드는 이렇게 생성한다.

  2) 힙, 우선순위 큐

     최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로 만들어진 자료구조

     linkedlist나 array로 구현가능하다. 배열로 구현하는 편이 탐색에 있어서 비교적 간단하다.

     구현 방법은 길기 때문에 생략하고 배열에서 트리형식으로 구현하는 방법은

     부모 노드가 i이면 자식노드는 2i,2i+1으로 구현하면 된다. 

     
