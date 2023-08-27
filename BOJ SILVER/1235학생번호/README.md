##1235 학생번호

<공부한 점>

-StringBuilder는 그 자체로 문자열 비교가 되지 않는다
  -> StringBuilder a ,b;
  -> a.equals(b); 
  불가.
  
  해결방법
  toString()이용
  ex) a.toString().equals(b.toString()); 와 같이 사용.
  나머지  방법은 주소를 비교하는 것이기 때문에 사용하면 안된다.

-문자열 비교 함수
  compareTo() - 문자열 비교후 int형으로 값을 반환
                현재 객체가 더 작으면 음수로 같으면 0으로 더 크면 양수로
                이때 아스키코드로 비교한다.
  contains() - 문자열중 같은단어가 있으면 True를 반환한다.
  equalsIgnoreCase() - 대소문자 신경안쓰고 비교 ex) APPLE = apple

-문자열 일부 추출방식
  문자열 함수중 substring() 함수를 이용하면 된다.
  
  ex) String substring(int begin)
      String substring(int begin, int end)

-문자열 중복 확인방법
  Set 사용 -> Set<E> 객체명 = new HashSet<E>();
