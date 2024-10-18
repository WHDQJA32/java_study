package study.practice;

public class practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int x = 2;
		int y = 3;
		int z;

		System.out.println("x="+x + " y="+y);
		//                 	x=2 y=3
		System.out.println(x + y);
		//					5
		System.out.println(x++ + y++);
		//					5 x=3 y=4
		System.out.println("x="+x + " y="+y);
		//				    x=3 y=4
		z = ++x + ++y;
		//	z = x=4 y=5 z=9
		System.out.println("x="+x + " y="+y);
		//					x=4 y=5
		z--;
		// z=8
		x += --y;
		// x = x + --y; ->  x=8 y=4 z=8
		System.out.println("x="+x + " y="+y + " z="+z);
		//					x=8 y=4 z=8
		x = 10; // x=10 y=4 z=8
		z = x/y++; // 10/4 = 2.5 -> 2  x=10 y=5 z=2
		
		System.out.println("x="+x + " y="+y + " z="+z);
		//					x=10 y=5 z=2
		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z);
		//					x=20 y=6 z=2
		System.out.println("x="+x + " y="+y + " z="+z);
		//					x=10 y=6 z=2
		
		 
		 x=2 y=3
		 5
		 5
		 x=3 y=4
		 x=4 y=5
		 x=8 y=4 z=8
		 x=10 y=5 z=2
		 x=20 y=6 z=2
		 x=10 y=6 z=2
		
		
		
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println( (a<b) && (c>=a) );
						//	true true = true
		System.out.println( (a == b ) || ( a >= b) || (c > 10) );
						// 	false			false		true	=false
		boolean result = !(c == 3);
					    //	false
		System.out.println( result );
		
		
		
		
		
		//3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.
		
		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
		6000원 이하 -> "훌륭"
		6000원 초과 ~ 8000원 -> "선방"
		8000원 초과 ~ 12000원 -> "눈물"
		12000원 초과 -> "물로배채우기"
		
		
		
		훌륭
		int menuPrice = 5000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String event = (menuPrice <= 6000) ?  "훌륭" : "선방" ;
		System.out.println(event);
		
		선방
		int menuPrice = 7000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String event = (menuPrice <= 8000) ?  "선방" : "눈물" ;
		System.out.println(event);
		
		눈물
		int menuPrice = 9000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String event = (menuPrice <= 12000) ?  "눈물" : "물로배채우기" ;
		System.out.println(event);
		
	
		int menuPrice = 13000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String event = (menuPrice >= 12000) ? "물로배채우기" : "" ;
		
		System.out.println(event);
		*/
		
		int menuPrice = 6000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result = (menuPrice <= 6000)?"훌륭" : (menuPrice <= 8000)?"선방" : (menuPrice <= 12000)?"눈물" : "물로배채우기";
		System.out.println(result);
		
		
		
	
		
		
	}

}
