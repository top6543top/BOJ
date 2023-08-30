## 실버 4 동전0

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
  
		int c=sc.nextInt(),b=sc.nextInt(),d=0;
  
		int a[]=new int[c];
  
		while (c-->0){
  
			a[c] = sc.nextInt();
   
		}
  
		for(int i:a){
  
			if(b/i>0)
   
			{ d+=b/i;b%=i;}
   
		}
  
		System.out.println(d);
  
		sc.close();
  
	}
 
}

- 이런 식으로 짜면 더 좋은 방식으로 짤 수 있다.

  내 문제점 -> 동전을 빼서 개수를 구해서 일일이 계산해야함으로 복잡도 증가, 코드 길이 증가
              나누기로 하면 한번에 그 동전의 개수를 해결할 수 있다. 굳이 자료구조에 저장해서
              해결하겠다는 생각하지 말자
  
- 그리고 stack의 pop을 이용하면 시간이 오래걸린다
