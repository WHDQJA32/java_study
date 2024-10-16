package study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2 = 0b10;		//2
		int num8 = 012; 		//10
		int num10 = 10; 		//10
		int num16 = 0x30; 		//48
		
		char var1 = 'A';
		char var2 = 86;
		char var3 = 0x0123;
		
		char var4 = 'N';// 'AD' 문자 두개불가 "Q" 큰 따옴표 사용불가(작은 따옴표 사용)
			
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		String menu = "점심메뉴";
		String subMenu = "12332"; // 꼭 큰 따옴표 사용
		
		System.out.println(menu);
		System.out.println(subMenu);
		
		System.out.println(var2 + 10);
		//					86  + 10 = 96
		System.out.println(menu + subMenu);
		//					점심메뉴 + 12313 그대로 이어 붙여진다.
		System.out.println(menu + var2);
		System.out.println(subMenu + 500);
		
		String msg = " \"안녕\" 하세요";
		System.out.println(msg);
		
		
		double d1 = 12.12;
		double d2 = 0.1212e2;
		float f1 = 12.12f;
		
		boolean stop = false; // 참과 거짓 표현.
		boolean open = true;
		boolean close = false;
		
		
	}
	
	public static void main2(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void main3(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void main4(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void main5(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
