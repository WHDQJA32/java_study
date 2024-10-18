package study.practice;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력하세요(1~24): ");
		int time = scanner.nextInt();
		
		if(time >= 1 && time <= 24) {
			
			//정상범위
			if(time <= 12) { // 1~12
				//오전
				//이른/늦은
					System.out.println("오전입니다.");
				if( time <= 6) {
					System.out.println("이른 오전입니다.");
				} else {
					System.out.println("늦은 오전입니다.");
				}
				
			} else { // 13~24
				//오후
				//이른/늦은
				System.out.println("오후입니다.");
				if( time <= 18) {
					System.out.println("이른 오후입니다.");
				} else {
					System.out.println("늦은 오후입니다.");
				}
			}
		} else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		//int diceNum = 3; //주사위 수 1~6

		// if문 변환
		switch(diceNum) {
		case 1: // diceNum == 1
		System.out.println("1");
		break;
		case 2:
		System.out.println("2");
		break;
		case 3:
		System.out.println("3");
		case 4:
		System.out.println("4");
		case 5:
		System.out.println("5");
		break;
		default:
		System.out.println("6");
		//case 6:
		}
		
		int diceNum = 120;
		
		if(diceNum==1) {
			System.out.println("1");
		}else if (diceNum==2) {
			System.out.println("2");
		}else if (diceNum==3) {
			System.out.println("3,4,5");
		}else if (diceNum==4) {
			System.out.println("4,5");
		}else if (diceNum==5) {
			System.out.println("5");
		}else {
			System.out.println("6");
		}
		
		
		String localNum ="051";
		switch(localNum) {
		case "031":
			System.out.println("경기도입니다");
			break;
		case "02":
			System.out.println("서울입니다");
			break;
		case "041":
			System.out.println("충남입니다");
			break;
		case "051":
			System.out.println("부산입니다");
			break;
		}
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		if( score >= 90) {
			System.out.println("학점 A");
		} else if ( score >= 80) {
			System.out.println("학점 B");
		} else if (score >= 70) {
			System.out.println("학점 C");
		} else if (score < 70) {
			System.out.println("학점 F");
		}
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		switch(score/10) { 						// if문에서 switch문으로 바꾸는 방법!
		case 9: 								// case 100~90 까지 쓰면 나온다.
			System.out.println("학점 A");
			break;
		case 8: 
			System.out.println("학점 B");
			break;
		case 7: 
			System.out.println("학점 C");
			break;
		default:
			System.out.println("학점 F");
		}
		
	}
}
	
		
		
		
		





