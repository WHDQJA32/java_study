package study.quiz; 

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
		int count = 1;
		int out = 0;

		while (count<=3) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1부터 10까지 중 한개의 정수를 입력하세요: ");

		int num = scanner.nextInt();
		
		int j = (int)(Math.random()*10);

		System.out.println(j);
		
		if (num == j) {
			System.out.println("안타입니다.");
		} else {
			System.out.println("아웃입니다.");
			out++;
		}
		if (out == 3) {
			System.out.println(count+"회가 종료됩니다.");	
			System.out.println();
			count++;
			out=0;
		}
	}

	}
}
		
		
	