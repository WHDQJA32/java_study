package study.iter;

public class Iteration03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//i : 1
		
		for(int i=1; i<=5; i++) { //i:1 2 3 4 5
			
			//실행문
			System.out.println("for i 내부 실행문 시작" + i);
			for(int j=1; j<=3; j++) {
				System.out.println("for j 실행문 " + j );
			}
			
			System.out.println("for i 내부 실행문 끝");
		}
		
		
		for(int i=0; i<3; i++ ) {
			
			int j = 1;
			while(j<=2) {
				System.out.println("쓸기");
				j++;
			}
			
			for(int k=1; k<=3; k++) {
				System.out.println("닦기");
			}
			
			System.out.println("쓰레기정리");
			
		}
	}

}