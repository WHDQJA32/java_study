package study.practice;

import java.util.Scanner;

public class practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 활용 버전
		Scanner scanner =  new Scanner(System.in);
		int menu; //몇번 메뉴 입력
		int count; // 몇개 주문
		String addOrder; // y/n
		
		String[] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] priceArr = {3500, 4100, 4300}; //메뉴 가격
		// index : 			0	  1 	2
		int[] countArr = new int[3]; //메뉴 주문 수량
		// index : 0 1 2
		// 사용자 선택 : 1 2 3
		//index0:아메리카노 수량
		//index1:카페라떼 수량
		//index2:바닐라라떼 수량
	while(true) {	
		while(true) {
				//아메리카노 3800
			System.out.println("=======메뉴=======");
			for(int i=0; i<menuArr.length; i++) {
				// 1.메뉴이름 메뉴가격원
				// 2.메뉴이름 메뉴가격원
				// 3.메뉴이름 메뉴가격원

				System.out.printf("%d.%s %d원\n", i+1, menuArr[i], priceArr[i] );
			}
			System.out.println("===================");
			
			System.out.print("메뉴 선택 : "); // 1,2,3
			menu = scanner.nextInt();
			if (menu >= 1 && menu <= menuArr.length) {
				break;
			}else {
				System.out.println("잘못입력했습니다. 다시 입력하세요");
			}
		}
		//메뉴 입력 완료
		//수량 입력받기
			System.out.print("수량 선택 : ");
			count = scanner.nextInt(); //몇개
			
			countArr[menu-1] += count; //수량 증가 시키기
			//추가 주문 여부
			scanner.nextLine();
			while(true) {	
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine(); // 문자열
				
				if(addOrder.equals("y") || addOrder.equals("n"))
					break;
				else
					System.out.println("잘못입력했습니다. 다시 입력하세요");
		}
		
			if(addOrder.equals("n")) {
				//입력받는 반복문 끝.
				//주문한 메뉴 보여주고
				
				int total =0;
			
				for(int i=0; i<menuArr.length; i++) {
					
					if(countArr[i] > 0) {
						System.out.printf("%s %d잔 : %d원\n", menuArr[i], countArr[i], 
								(countArr[i]*priceArr[i]));
						total = total + (countArr[i]*priceArr[i]);
						
					}
				}
				//total 총액 저장
				System.out.println("=================");
				System.out.println("총액 : " + total + "원");
				break;
			}
			
	}
				
			//1~3
			
//			if( !(menu >= 1 && menu <= menuArr.length)) {
//				continue;
//			}
			
			
/*			
			if(menu == 1 || menu == 2 || menu == 3) { //정상 선택 1,2,3
				
				System.out.print("수량 선택 : ");
				count = scanner.nextInt();
				
				if(menu == 1)				// 수량 선택 값 저장
					menu1Count += count;    // + 를해서 계속 저장 
				if(menu == 2)
					menu2Count += count; 
				if(menu == 3)
					menu3Count += count;
				
				
				scanner.nextLine(); //입력값 청소
			while(true) {	
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine(); // 문자열
				
				if(addOrder.equals("y") || addOrder.equals("n"))
					break;
				else
					System.out.println("잘못입력했습니다. 다시 입력하세요");
			}
				
				if(addOrder.equals("n")) { //문자열은 equals 로 비교.
					//입력받는 반복문 끝.
					//주문한 메뉴 보여주고
					
					//아메리카노 몇개 * 가격
					if(menu1Count > 0)
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
					
					//라떼 몇개 * 가격
					if(menu2Count > 0)
					System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
					
					//바닐라라떼 몇개 * 가격
					if(menu3Count > 0)
					System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count*4300);
					
					//누적합 -> 총 금액 보여주기 -> 끝.
					int total= menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
					System.out.println("총액 :" + total + "원");
					break;
				}
				
			}else { //메뉴 보여주고, 메뉴 입력을 다시 받기
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
		
		}
*/		
		/*
		System.out.println("========메뉴========");
		System.out.printf("%-10s%8s\n","1.아메리카노",  "3500원");
		System.out.printf("%-10s%8s\n","2.카페라떼",   "4100원");
		System.out.printf("%-10s%8s\n","3.바닐라라떼",  "4300원");
		System.out.println("===================");
		
		
		//기본 타입 변수들 , 각각 처리 버전
		Scanner scanner =  new Scanner(System.in);
		int menu;
		int count;
		String addOrder;
		
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
		while(true) {
			
			System.out.println("========메뉴========");
			System.out.println("1. 아메리카노   3500원");
			System.out.println("2. 카페라떼　   4100원");
			System.out.println("3. 바닐라라떼   4300원");
			System.out.println("===================");
			
			System.out.print("메뉴 선택 : "); // 1,2,3
			menu = scanner.nextInt();
			if(menu == 1 || menu == 2 || menu == 3) { //정상 선택 1,2,3
				
				System.out.print("수량 선택 : ");
				count = scanner.nextInt();
				
				if(menu == 1)				// 수량 선택 값 저장
					menu1Count += count;    // + 를해서 계속 저장 
				if(menu == 2)
					menu2Count += count; 
				if(menu == 3)
					menu3Count += count;
				
				
				scanner.nextLine(); //입력값 청소
			while(true) {	
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				addOrder = scanner.nextLine(); // 문자열
				
				if(addOrder.equals("y") || addOrder.equals("n"))
					break;
				else
					System.out.println("잘못입력했습니다. 다시 입력하세요");
			}
				
				if(addOrder.equals("n")) { //문자열은 equals 로 비교.
					//입력받는 반복문 끝.
					//주문한 메뉴 보여주고
					
					//아메리카노 몇개 * 가격
					if(menu1Count > 0)
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
					
					//라떼 몇개 * 가격
					if(menu2Count > 0)
					System.out.printf("카페라떼 %d잔 : %d원\n", menu2Count, menu2Count*4100);
					
					//바닐라라떼 몇개 * 가격
					if(menu3Count > 0)
					System.out.printf("바닐라라떼 %d잔 : %d원\n", menu3Count, menu3Count*4300);
					
					//누적합 -> 총 금액 보여주기 -> 끝.
					int total= menu1Count*3500 + menu2Count*4100 + menu3Count*4300;
					System.out.println("총액 :" + total + "원");
					break;
				}
				
			}else { //메뉴 보여주고, 메뉴 입력을 다시 받기
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
			}
		
		}
*/
	}
}
	

		
	