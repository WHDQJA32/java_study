package study.practice;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하세요 :");
		int year = scanner.nextInt();
			
		if(year%400 == 0) {
			System.out.println("윤년이다.");
		} else if(year%100 == 0) {
			System.out.println("윤년이 아니다.");
		} else if(year%4 == 0) {
			System.out.println("윤년이다.");
		} else {
			System.out.println("윤년이 아니다.");
		}
		
		
	}
		
}
		



