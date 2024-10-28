package study.cls.cls03;

public class Calc {
	//필드
	
	//생성자
	
	//메소드
	
	//리턴 		O/X
	//매개변수 	O/X
	
	//리턴 X 매개변수 X
	void powerOn() {
		System.out.println("전원 On");
	}
	
	//리턴 X 매개변수 O
	void setOwner(String name) {
		System.out.println(name + "님의 계산기입니다.");
	}
	//리턴 O 매개변수 O
	double divide(int x, int y) {
		//return 타입이 double
		double result = (double)x/y;

		return result;
	}
	
	//리턴 O 매개변수 X
	String madeByInfo() {
		
		String msg = "카시오";
		
		return msg;
	//	return "카시오";
	}
}
