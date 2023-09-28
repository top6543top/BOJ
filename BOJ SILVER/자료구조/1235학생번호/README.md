## 1235 학생번호

<공부한 점>

- StringBuilder는 그 자체로 문자열 비교가 되지 않는다
  -> StringBuilder a ,b;
  -> a.equals(b); 
  불가.
  
  해결방법
  toString()이용
  ex) a.toString().equals(b.toString()); 와 같이 사용.
  나머지  방법은 주소를 비교하는 것이기 때문에 사용하면 안된다.

- 문자열 비교 함수
  compareTo() - 문자열 비교후 int형으로 값을 반환
                현재 객체가 더 작으면 음수로 같으면 0으로 더 크면 양수로
                이때 아스키코드로 비교한다.
  contains() - 문자열중 같은단어가 있으면 True를 반환한다.
  equalsIgnoreCase() - 대소문자 신경안쓰고 비교 ex) APPLE = apple

- 문자열 일부 추출방식
  문자열 함수중 substring() 함수를 이용하면 된다.
  
  ex) String substring(int begin)
      String substring(int begin, int end)

- 문자열 중복 확인방법
    Set 사용 -> Set<E> 객체명 = new HashSet<E>();
     
     Set은 List와는 다르게 객체(데이터)를 중복해서 저장할 수 없다. 
     또한 저장된 객체(데이터)를 인덱스로 관리하지 않기 때문에 저장 순서가 보장되지 않는다. 
     수학의 집합과 비슷한 내용이다. Set 컬렉션을 구현하는 대표적인 클래스들은 HashSet, TreeSet, LinkedHashSet 등이 있다.
     Set은 인덱스로 객체를 관리하지 않기 때문에 데이터를 검색하기 위해서는 iterator() 메서드로 Iterator(반복자)를 생성하고 데이터를 가져와야 한다.

     Set<E> 객체명 = new TreeSet<E>();
     TreeSet도 HashSet과 같이 중복된 데이터를 저장할 수 없고 입력한 순서대로 값을 저장하지 않는다. 차이점은 TreeSet은 기본적으로 오름차순으로 데이터를 정렬한다.

     Set<E> 객체명 = new LinkedHashSet<E>();
     LinkedHashSet도 중복된 데이터를 저장할 수 없다. 차이점은 입력된 순서대로 데이터를 관리한다. 
