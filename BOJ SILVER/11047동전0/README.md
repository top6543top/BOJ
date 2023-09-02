## 실버 4 동전0

- 문제 방식
   그리디 알고리즘
  
- 공부한 점

 그리디 알고리즘이란 현재내릴수 있는 최선에 선택에 집중하는 알고리즘을 의미한다. 항상 전체의 최적해는 아니다.
 
 그리디 알고리즘
 1. 현재의 선택이 미래의 선택에 영향을 주지 않는다.
 2. 부분의 최적해가 모이면 전체의 최적해가 된다.
 3. 정렬을 잘해야한다.
 
  
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
