package study.practice;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
	// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("밑변 입력 : ");
		int width = scanner.nextInt();
		System.out.println("높이 입력 : ");
		//int height = scanner.nextInt();
		double height = scanner.nextDouble(); //실수 타입
	
		System.out.println("삼각형의 넓이는 " + (width*height/2) + "입니다.");
	
	
	// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
	// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
	
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("윗변 입력 : ");
		int up = scanner.nextInt();
		System.out.print("밑변 입력 : ");
		int width1 = scanner.nextInt();
		System.out.print("높이 입력 : ");
		int height1 = scanner.nextInt();
		
		System.out.println("사다리꼴의 넓이 : " + (up+width)*height/2.0);
		
	
	// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
	// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
	// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요. 	
		
		int personCount = 24;
		int snackCount = 100;
		
		System.out.println("한명당 " + (snackCount/personCount)+ "개 과자를 나누고");
		System.out.println("남는 과자는 " + (snackCount%personCount)+"개 입니다.");
		
		
	// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
	// 158
	// 백의자리 : 1
	// 십의자리 : 5
	// 일의자리 : 8

		Scanner scanner2 = new Scanner(System.in);
		System.out.print("세자리 정수 입력 :");
		int num = scanner.nextInt();
		
		//	158
		//	158 / 100 = 1.58 -> 1					   백의 자리
		//	158 % 100 = 58			58 / 10 = 5.8 -> 5 십의 자리
		//	158 / 10 = 15.8 -> 15	15 % 10 = 5		   십의 자리
		// 	158 % 10 = 8							   일의 자리
		
		System.out.println("백의자리 : " +		(num/100));
		System.out.println("십의자리 : " +		(num/10%10));
		System.out.println("일의자리 : " +		(num%10));
		
		
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
	
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		
		int z = 10;
		x = y;
		y = z;
		System.out.println("x="+x+ " y="+y);
	
	}

}
