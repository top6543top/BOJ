## 실버 5  1181 단어정렬

- 문제 유형

  정렬, 자료구조

- 공부한점

  위 문제는 글자수 -> 오름차순 순으로 단어를 정렬하는 문제이다.

  방법은 여러가지가 있겠지만 나는 HashSet-> ArrayList로 변환하여 collections.sort()를 이용하는 방법을 이용하였다.

  1) collections.sort()
 
     어떠한 클래스를 정렬한다고 한다면

    ex)

    ```java
    public class People{
      String name;
      int age;
      public people(String name,int age){
        this.name = name;
        this.age = age;
      }
      // 와 같이 people을 어떠한 방식으로 정렬하고 싶다면 compareTo함수를 선언하여 기준을 만들어 주어야 한다.
      // int 형을 반환하게 하고 1을 반환하면 오름차순 -1을 반환하면 내림차순 0 이면 변환하지 않는다.
      // 이때 extends comparable<People>을 상속하여 compareTo함수를 오버라이딩 하는 방식이어야 한다.
      // 반면 오름차순, 내림차순이 아닌 다른 방식으로 정렬기준을 세우고 싶다면
      // implements Comparator<People>을 상속해주면 된다. 이때 함수는 compare() 을 오버라이딩 하면된다. 
    }
    ```



    이때 더 간단하게 구현하는 방법은 내가 푼 방식의 익명클래스를 이용한 람다식을 이용하는 것인데, 코드를 참고하도록 한다.



    ArraySort도 같은 방식으로 사용할 수 있다. 이 문제에서는 ArraySort를 사용하는 것이 더욱 간단하고 빠르다고 할 수 있다,


    ```java
      Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
    ```

  collections 도 똑같이 사용 가능하겠지만 이와 같이하면 더 좋다.
