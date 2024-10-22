package study.quiz;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도를 입력하세요 :");
		int year = scanner.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 :");
		int backN = scanner.nextInt();
		
		/*	옵션사항.
		if(year >= 1901 && year <= 2024) {
		}else {
		}
		*/
		
		int age = 2024 - year + 1; //나이계산 한국나이
		
		if(year >= 2000 && backN == 3 ) {	
			System.out.println(age+"살 남자입니다.");
		}else if(year >= 2000 && backN == 4) {
			System.out.println(age+"살 여자입니다.");
		}else if(year < 2000 && backN == 1) {
			System.out.println(age+"살 남자입니다.");
		}else if(year < 2000 && backN == 2) {
			System.out.println(age+"살 여자입니다.");
		}else 
			System.out.println("잘못된 입력입니다.");
		
	}

}