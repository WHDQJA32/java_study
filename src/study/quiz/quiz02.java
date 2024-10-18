package study.quiz;

import java.util.Scanner;

public class quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = -2;
		
		String result = (num < 0)? "음수" : (num > 0 )? "양수": (num == 0)? "0" : "" ;
							// (num > 0 ? " 양수 " : (num < 0 ? "음수" : "0") );
		System.out.println(result);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int point1 = scanner.nextInt();
		System.out.println("입력한 숫자=" + point1);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int point2 = scanner.nextInt();
		System.out.println("입력한 숫자=" + point2);
		
		System.out.println();
		
		System.out.println("더하기 :" + point1 + "+" + point2 + "=" + (point1+point2));
		System.out.printf("빼기 : %d-%d=%d\n", point1, point2, point1-point2);
		System.out.printf("곱하기 : %d*%d=%d\n", point1, point2, point1*point2);
		System.out.printf("나누기 : %d/%d=%d\n", point1, point2, (double)point1/point2);
	}

}
