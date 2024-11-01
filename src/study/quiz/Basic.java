package study.quiz;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int out = 0;
		
			while (true) {

			Scanner scanner = new Scanner(System.in);
			System.out.print("1부터 10까지 중 한개의 정수를 입력하세요: ");
			int num = scanner.nextInt();
		

			int j = (int) (Math.random() * 10);

			System.out.println(j);
			if (num == j) {
				System.out.println("안타입니다.");
			} else {
				System.out.println("아웃입니다.");
				out++;
			}
			if (out == 3) {
				System.out.println("게임이 종료됩니다.");
				break;
			}	
			
		}

	}

}
