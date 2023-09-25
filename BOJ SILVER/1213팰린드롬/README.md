## 1213 팰린드롬


-문제유형

 양방향 큐, 문자열

- 공부한점



 펠린드롭 확인하는 방법에 sb.reverse().toString() 와 같은 방법을 사용하면 된다.

 StringBuffered 에서만 가능 toString은 객체가 가지고 있는 정보나 값들을 문자열로 반환해주는 함수이다.





// 백준 다른 사람거 예시(맞는 답은 아님)
public class Main {

    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<Character,Integer> map = new HashMap<>();
        
        String s = br.readLine();
        
        for(int i=0; i<s.length(); i++){
        
               
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);    ----> 한글자가 얼머나 있는지 확인하고 map에 글자와 함께 집어 넣는다.
        }
        
        int cnt=0;
        
        Character midIndex=' ';
        
        Queue<Character> left = new LinkedList<>();//가운데 기준으로 왼쪽은 큐로  ---> FIFO
        
        Stack<Character> right = new Stack<>();//오른쪽은 스택으로 넣음  ----> FILO
        
        for (Character character : map.keySet()) { ---> map에 모든 것을 출력할때 사용 ---> 여기서 한글자 이면 가운데에 넣어 주는듯
            
            if(cnt==2)break;
           
            if(map.get(character)==1){ //ABACABA
                
                cnt++;
               
                midIndex=character;
               
                continue;
            
            }  ---->한글자 일때
           
            int index = map.get(character)/2; 
            
            if(map.get(character)%2==1){
               
                midIndex=character;
                
                cnt++;
           
            } ---- > 홀수개 있을때
           
            for(int i=0; i<index; i++){
            
                left.offer(character);
                
                right.push(character);
            }
            
        }
        
        StringBuilder sb = new StringBuilder(); ----> 수정가능한 문자열 객체 생성
        
        if(cnt==2){ ---> 한글자가 두번있는 경우는 안된다.
        
            System.out.println("I'm Sorry Hansoo"); 
        
        }else{ 
        
            while(!left.isEmpty()){
            
                Character poll = left.poll();
                
                sb.append(poll);
            
            } --- > 왼쪽에 있는 걸 문자열에 추가
            
            if(midIndex != ' ') sb.append(midIndex);//여기서 가운데 값 넣음
           
           while(!right.isEmpty()){
           
               Character pop = right.pop();
               
               sb.append(pop);
           
           }
           
            System.out.println(sb);
        
        }
    
    }

}

새로 배운 명령어

1)getOrDefault ---> getOrDefault(Object key, V DefaultValue)

찾는키가 존재한다면 찾는키의 값을 반환하고 없다면 기본 값을 반환하는 메서드

ex)
public class Method {
	
	public static void main(String []args) {
		

    String[] alphabet = {"A","B","C","A"};
  	
    HashMap<String, Integer> map = new HashMap<>();
  	
    for(String key : alphabet) {
  	
     map.put(key,  map.getOrDefault(key, 0)+1); ----> 이렇게 사용
  		
    }
		
  System.out.println("결과 : "+map);
	
 }

}//결과 : {A=2, B=1, C=1}

2) KeySet() 

map을 전체 출력할 때 사용

ex)

for (String key : map.keySet()) {
	
 String value = map.get(key);
	
 System.out.println("[key]:" + key + ", [value]:" + value);

} ----> 반복문을 이용하여 사용

3) QUEUE 함수

Queue<Integer> q = new LinkedList<>();

1.q.add(x); vs q.offer(x); 

- add는 큐 뒤에 값 삽입. 값 추가 성공시 true반환. 큐가 꽉찬 경우 IllegalStateException 에러 발생.

- offer은 큐 뒤에 값 삽입. 값 추가 성공시 true반환. 큐가 꽉찬 경우 false 반환

2.q.remove(); vs q.poll();

- remove는 큐 맨 앞에 있는 값 반환 후 삭제. 큐가 비어 있는 경우 NoSuchElementException 에러 발생.

- poll은 큐 맨 앞에 있는 값 반환 후 삭제. 큐가 비어있을 경우 null 반환.

3.q.element(); vs q.peek();

- element는 큐의 맨 앞에 있는 값 반환. 큐가 비어 있는 경우 NoSuchElementException 에러 발생.

- peek는 큐의 맨 앞에 있는 값 반환. 비어있을 경우 null 반환.


4) StringBuilder


String 같은 경우는 문자열을 변경하면 새로운 객체를 만들어낸다. 프로그램이 작으면 상관없지만

지속적으로 문자열을 변경해주는 프로그램의 경우 문제가 생길 수 있으므로 StringBuilder을 이용한다

StringBuilder sb = new StringBuilder(); 와 같이 선언

명령어는 나중에 검색해 볼 것.
