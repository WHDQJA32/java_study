package study.quiz;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int count = 1;
		int out = 0;
		String[] user = {"번타자 김일번","번타자 김이번","번타자 김삼번","번타자 김사번","번타자 김오번",
				"번타자 김육번","번타자 김칠번","번타자 김팔번","번타자 김구번"};
		int m = 0;
		
		for(int i=1; i<=3; i++) {
			System.out.println();
			System.out.println(i + "회 시작");
			out = 0;
			
			while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println((m+1) + user[m]);
			System.out.print("1부터 10까지 중 한개의 정수를 입력하세요: ");
		
			int num = scanner.nextInt();
			
			int j = (int)(Math.random()*10);
	
			System.out.println(j);
			
			if (num == j) {
				System.out.println("안타입니다.");
				System.out.println();
				m++;
			} else {
				System.out.println("아웃입니다.");
				System.out.println();
				out++;
				m++;
				
			}
			if (out == 3) {
				System.out.println((count) +"회가 종료됩니다.");	
				System.out.println();
				count++;
				break;
				
			} else if (m==9) {
				m=0;
			}
		}
		
	}
	
	}
}
