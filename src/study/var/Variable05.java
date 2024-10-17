package study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "test";
		
		System.out.println("출력 1");
		System.out.println("출력 2");
		System.out.println(s);
		
		System.out.print("출력 3");
		System.out.print("출력 4");
		System.out.print(s);
		
		int hour = 10;
		int minute = 26;
		
		//현재 10시 26분 입니다.
		System.out.println("현재 " + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n", hour, minute); //printf는 줄바꿈이 없다.
		
		double rate = 1.15512;
		
		System.out.printf("%10.2f %%\n", rate); // 10자리 중에서 소수점 2번째 자리까지 보여주겠다.
		// %를 출력하고 싶으면 %% 두개를 사용한다. ex) \\ // 등등..
		
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력하세요 : ");
		String input = scanner.nextLine(); // "아무거나입력"
		System.out.println(input);
		
		System.out.println("당신이 입력한 값은 : " + input);
		System.out.printf("당신이 입력한 값은 : %s\n", input);
		
		System.out.print("점수를 입력하세요 : ");
		int point = scanner.nextInt();
		// scanner.nextDouble();
		//String -> int
		System.out.println(point);
		
		
		
	}

}
