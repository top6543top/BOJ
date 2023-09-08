## 실버3 11659 구간합구하기4

- 문제유형

  누적합

- 공부한 점

  누적합이란 나열된 수의 누적된 합이다. 즉 [1,1],[1,2].....[1,n-1],[1,n]까지의 합 이런식으로 나열되어 있는 것이다.

  누적합을 쓰는 이유 -> 시간 복잡도를 줄일 수 있다. 기존에 이 문제를 풀이할 때 사용했던 코드 중 일부이다.



  ```java
  for(i=0;i<b;i++){
		    int result=0;
		    st=new StringTokenizer(br.readLine());
		    c=Integer.parseInt(st.nextToken());
		    d=Integer.parseInt(st.nextToken());
		    for(j=c;j<=d;j++){
		        result+=num[j];
		    }
		    string.append(result+"\n");
		}
  ```




  이런식으로 이중 반복문을 쓰게 되면 m범위의 n개의 구간합을 구할때 시간복잡도는 O(mn)이다.
  
  누적합을 쓰게되면 입력된 값의 누적합만 구하면 됨으로 시간 복잡도가 O(m+n)이 되어 더욱 빠르게 풀이할 수 있다. 
