package study.practice.practice18;

public class Circle {
	
	int raidus;
	double getArea;
	
	//Circle(){} 기본 생성자 안만들어도된다.

	public void setRadius(int radius) {
		this.raidus = radius;
	}
	double getArea() {
		return raidus*raidus*3.14;
	}
}

