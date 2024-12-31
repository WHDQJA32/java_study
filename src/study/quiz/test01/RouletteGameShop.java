package study.quiz.test01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RouletteGameShop {

	int totalSales; // 매출액
	boolean Opened; // 영업 여부
	List<GameUser> UserList; // 게임을 하는 유저 리스트
	int totalPoint; // 총합포인트

	public RouletteGameShop() {
		totalPoint = 0;
		totalSales = 0;
		Opened = false;
		UserList = new ArrayList<GameUser>();
	}

	public void addUser(String name, String chainStore) {
		UserList.add(new GameUser(name, chainStore));
	}

	public void startGame() {
		Opened = true;
		System.out.println("=====룰렛게임 영업시작=====");

		

		while (Opened) {
			
			int menu = getMainMenu();
			
			switch (menu) {
			case 1: // 충전하기
				ChargingMenu();
				break;
			case 2: // 게임시작
				StartGame();
				break;
			case 3: // 마감하기
				System.out.println();
				finishSales();
				System.out.println("매출액 : " + totalSales);
				break;
			}
		}
	}

	void StartGame() {
		
		Scanner scanner = new Scanner(System.in);
		int dice = 0;
		
		System.out.println("룰렛 게임을 시작합니다.");
		System.out.print("주사위 굴리기 1번/ 게임 중단 2번");
		System.out.println();
		
		switch (dice) {
		case 1:
			System.out.println("주사위를 굴립니다.");
			break;
		case 2:	
			System.out.println("게임을 중단합니다.");
			break;
		}
		


	}

	void ChargingMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("충전금액을 입력해주세요 : ");

		GameUser selected = UserList.get(totalPoint);

		int totalPoint = scanner.nextInt();
		selected.Charging(totalPoint);

		System.out.println();
		System.out.println(selected.id + " : " + selected.totalPoint + "원 [충전완료]");
		totalSales += totalPoint; // 매출액에 추가

	}

	void finishSales() {
		Opened = false;
		System.out.println("====[ 룰렛게임 영업마감 ]====");
	}

	int getMainMenu() {

		Scanner scanner = new Scanner(System.in);
		int menu = 0;

		while (true) {
			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.충전하기  2.게임시작  3.마감하기");
			System.out.print(">>> 입력 : ");

			try {
				menu = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				menu = 0;
			}

			if (menu >= 1 && menu <= 3) {
				break;
			} else {
				System.out.println(">>> 보기 중에 선택하세요 (1 ~ 3).");
			}
		}
		return menu;
	}
}
