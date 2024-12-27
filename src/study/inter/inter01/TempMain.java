package study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Temp t = new Temp(); 인터페이스 생성불가

		TempObject t1 = new TempObject();			
		
		Temp t = new TempObject();
		Temp t2 = new TempObject();
		
		Temp[] tArr = new Temp[3]; //배열공간만드는건 가능
//		tArr[0] = new Temp(); 안된다.
		tArr[0] = new TempObject();
				
		
		//상속 : 부모클래스 타입 = 자식 객체
		//인터페이스 : 인터페이스 타입 = 구현객체(해당 인터페이스를 구현한)
	}

}
