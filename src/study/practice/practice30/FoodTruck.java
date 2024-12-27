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

			switch (menu) {
			case 1: // 메뉴보기
//				for(Food f : foodList) { //반복문 통해서 보여주기. getFoodInfo()사용해서
//					System.out.println(f.getFoodInfo());
//				}
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
				}
				break;
			case 2: //주문
				for (int i = 0; i < foodList.size(); i++) {
					System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
				}
				System.out.println("주문 메뉴를 선택하세요 : ");
				int orderMenu = scanner.nextInt();
				break;
			case 3:
				break;
			case 4:
				isOpened = false;
				System.out.println("영업 마감");
				break;
			default:
				System.out.println("잘못 입력 하셨습니다.\n");
			}

		}
	}
}
