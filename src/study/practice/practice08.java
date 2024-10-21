package study.practice;

public class practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		※규칙을 찾아보고 작성
		1) 반복문 1개로 결과 만들기
		2)반복문 2개 중첩해서 결과만들기
		
		for/while 반복
		
		단순 횟수만 반복 vs 연산(실행문) 참여
		 
		
		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
		12345
		12345
		12345
		12345
		12345

		//2.
		11111
		22222
		33333
		44444
		55555
		*/
		
		for(int i=1; i<=5; i++) {
			System.out.println("12345");
		}
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		for(int i=1; i<=5; i++) {
			System.out.println(i*11111);
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			System.out.print(i);
			}
			System.out.println();
		}
		
		
	}
}
