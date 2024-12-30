package study.practice.practice30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {

	// 필드
	String truckName; // 트럭이름 (매장이름)
	int totalSales; // 총매출액
	boolean isOpened; // 영업 중 여부
	List<Food> foodList; // 판매하는 메뉴리스트

	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public void addMenu(String name, int price) {
		foodList.add(new Food(name, price)); // 메뉴 리스트에 새로 만든 객체에 매개변수를 넘겨서 추가한다.
	}

	public void startSalse() {
		Scanner scanner = new Scanner(System.in);

		isOpened = true;
		System.out.println("====[푸드트럭 영업시작]====");

		while (isOpened) {
			System.out.println();
			System.out.println("메뉴선택 해주세요");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.print("입력 : ");

//			String input = scanner.nextLine();
//			int menu = scanner.nextLine();
			int menu = 0;
			try {
				menu = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				menu = 0;
			}
			
			int orderMenu;
			
			switch (menu) {
			case 1: // 메뉴보기
//				for(Food f : foodList) { //반복문 통해서 보여주기. getFoodInfo()사용해서
//					System.out.println(f.getFoodInfo());
//				}
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
				}
				break;
			case 2: // 주문
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
				}

				System.out.println("주문 메뉴를 선택하세요 : ");
				orderMenu = scanner.nextInt();

				// 주문 후 재고 처리

				// 예외처리 -> 숫자 범위를 벗어났거나 잘못된 값이 입력 되었나

				// 조건 : 재고가 없으면 주문 불가 -> 해당 메뉴의 재고를 확인 -1은 인덱스 위치때문에.
				if (foodList.get(orderMenu - 1).stock > 0) {
					// 재고가 있으면 주문 1개 처리

					System.out.printf("[주문정보] %s 메뉴 1개 주문완료!\n", foodList.get(orderMenu - 1).name);

				// 재고에서 -1개 처리.
				//foodList.get(orderMenu-1).stock -= 1; 

					foodList.get(orderMenu - 1).modifyStock(-1);

					// 몇개 주문 하시겠어요?

					// 매출액 증가
					totalSales += foodList.get(orderMenu - 1).price;
				} else {
					System.out.println("[품절] 해당 메뉴는 품절입니다!");
				}

				break;

			case 3: //재고관리
				
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
				}
				System.out.print("재고 관리할 메뉴를 선택하세요 : ");
				orderMenu = scanner.nextInt();
				
				System.out.print("재고 조정 갯수를 선택하세요 : ");
				int changeStockCount = scanner.nextInt();
				
				foodList.get(orderMenu - 1).modifyStock(changeStockCount);
				System.out.println();
				System.out.println("[재고 적용 완료]");
				System.out.println(foodList.get(orderMenu-1).getFoodInfo());
				
				break;
			case 4: //마감하기
				//매출 /원가 차감 -> 최종 수익!
				int lossSales = 0;
				for(Food food: foodList) {
					lossSales += (int)(food.price * 0.3) * food.stock;
				}
				System.out.println();
				System.out.println("[마감 정보]");
				System.out.println("[총 매출] : " + totalSales);
				System.out.println("[폐기 손해] : " + lossSales);
				System.out.println("[최종 수익] : " + (totalSales - lossSales));
				
				isOpened = false;
				System.out.println("영업 마감");
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.\n");
			}

		}
	}
}
