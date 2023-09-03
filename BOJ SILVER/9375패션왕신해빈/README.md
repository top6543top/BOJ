## 실버3 9375 패션왕 신해빈

- 문제 유형
  hashmap
  ---

- 공부한 점

  코드 상에서

  

  ```java
  if(map2.containsKey(b)){
                    map2.put(b,map2.get(b)+1);
    	        } else {
    	            map2.put(b,1);
    	        }
  ```



  이 부분을 getOrDefault(Object key, V DefaultValue)를 이용하여
  처리 했으면 더욱 간단하게 처리할 수 있었다.


  map 반복문 돌리는 법





  ```java
      //1번 : Java 1.8부터 가능
      map.forEach((key, value)->{
          System.out.println( String.format("키 -> %s, 값 -> %s", key, value) );
      });
      
      

      //2번
      Iterator<String> keys = map.keySet().iterator();
      while( keys.hasNext() ){
          String key = keys.next();
          System.out.println( String.format("키 -> %s, 값 -> %s", key, map.get(key)) );
      }


      //3번
      for( Map.Entry<String, String> elem : map.entrySet() ){
          System.out.println( String.format("키 -> %s, 값 -> %s", elem.getKey(), elem.getValue()) );
      }


      //4번
      for( String key : map.keySet() ){
          System.out.println( String.format("키 -> %s, 값 -> %s", key, map.get(key)) );
      }
  ```
  

