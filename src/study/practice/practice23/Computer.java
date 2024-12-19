package study.practice.practice23;

public class Computer {
	
	//정적 static
	//상수 final -> static final -> 상수인 경우 -> 모두 대문자로 표기
	//public static final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};

	public static final String[] OS_Type = {"윈도우10", "애플 OS X", "안드로이드"};
	
	//String oss;
	int OS;
	int main;
	
	public Computer(int OS, int main) {
		
		//this.oss = osType[OS];
		this.OS = OS;
		this.main = main;
	}
	
	public void print() {
		//System.out.println("운영체제:" + oss +", " + "메인메모리:" + main);
		System.out.println("운영체제:"+Computer.OS_Type[OS]+", "+"메인메모리:"+main);
	}
	
}
