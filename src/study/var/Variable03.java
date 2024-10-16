package study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1 =3.14;
		double d2 = d1;
		
		int i1 = 30;
		int i2 = i1;
		//int i3 = 3.123; 정수형변수 int = 실수형 값 XX
		
		i2 = (int)d2; // i2 = d2; <- int 타입한테 double을 저장하겠다. 오류
					// i2 = (int)3.14;
		// i2 = 3;
		System.out.println(i2);
		
		//double -> int 변환할 때 소수점은 사라진다. int 타입 = 정수만 표현(소수점X)
		
		//java 정수 -> int 인식
		//java 실수 -> double 인식
		
		float f1 = 4.43f;
		double d3 = f1; /* double = float 자동 타입 변환 
						(큰 허용범위타입에서 작은 허용범위타입으로 가능)*/
		double d4 = 300; //double = 정수형숫자300(int) 자동타입변환되어서 저장가능
		// 실수 타입으로 인식 300.0
		System.out.println(d4);
		
		//연산에서 형변환
		int intValue = 10;
		double doubleValue = 5.5;
		
		// int result = intValue + doubleValue; 잘못된 형식
					// int + double -> double
		// int = double
		
		int result = intValue + (int)doubleValue; // 강제변환타입(방법1)
		// int 		=	int + (int)double (int)5.5 -> 5
		// int     	=	int + 5 = 15
		
		result = (int)(intValue + doubleValue); 
		//강제변환타입(방법2) int 10 + double 5.5 -> double 15.5
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rt = (int)dv1 + (int)dv2;
		// int     int(5) + int(6) = 11
		System.out.println(rt);
		
		rt = (int)(dv1 + dv2);
		//    int (5.5 + 6.6 = 12.1) = 12
		System.out.println(rt);
		
	}

}
