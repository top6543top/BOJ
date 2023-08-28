## 실버4 1764 듣보잡

<공부한 점>

 - ArrayList 정렬하는 방법
   
   ArrayList<String> list = new ArrayList<>
   
  1) Collections.sort() 사용
     
        // 오름차순으로 정렬
        Collections.sort(list);
     
        // 내림차순으로 정렬
        Collections.sort(list, Collections.reverseOrder());
     
        // 대소문자 구분없이 오름차순
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
     
        // 대소문자 구분없이 내림차순
        Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
     
  2) List.sort() 사용 -> java 8 이상
       // 오름차순으로 정렬
        list.sort(Comparator.naturalOrder());
     
       // 내림차순으로 정렬
        list.sort(Comparator.reverseOrder());
     
       // 대소문자 구분없이 오름차순 정렬
        list.sort(String.CASE_INSENSITIVE_ORDER);

     
       // 대소문자 구분없이 내림차순 정렬
        list.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
     
  3) 사용자 정의 방식
