package study.cls.cls05.pack1;

public class PointMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point();
		
		p1.math = 90; //같은 패키지 default 사용가능
		p1.eng = 80;
//		p1.com = 100;
//		
//		p1.com = 200;
		
		p1.setMath(50);
		System.out.println( p1.getMath() );
		
		p1.math = 50;
		System.out.println(p1.math);
		
		p1.setCom(-80);
		System.out.println(p1.getCom());
	}
}
