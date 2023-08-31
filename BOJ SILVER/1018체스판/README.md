## 실버 4 1018 체스판 다시 칠하기

- 문제 풀이 방식
  
  배열, 삼항연산자, 다중 반복문

- 공부한 점
  
  풀이 방식 자체는 맞음 대신 체스판을 추가로 만들지 않아도 비교할 수 있는 방식이 있었음

	  ```c
	  public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] map = new String[50];
			int N = sc.nextInt();
			int M = sc.nextInt();
			for(int i = 0; i < N; i++)
				map[i] = sc.next();
			int ret = 64;
			for(int i = 0; i <= N - 8; i++) {
				for(int j = 0; j <= M - 8; j++) {
					int cnt = 0;
					for(int r = 0; r < 8; r++)
						for(int c = 0; c < 8; c++)
							if((r % 2 == c % 2 ? 'W' : 'B') == map[i + r].charAt(j + c))
								cnt++;
					ret = Math.min(ret, cnt);
					ret = Math.min(ret,  64 - cnt);
				}
			}
			System.out.println(ret);
			sc.close();
		}
		}
	


이런식으로  짝수칸이면 W가 되도록 삼항연산자를 이용했으면 훨씬 간단한 방식으로 식이 나왔을 것
