package study.practice.practice21;

//1. Monitor 클래스 생성 -> 클래스 생성

public class Monitor {
	
//	2. 속성 ( 제조회사, 인치, 가격, 색상, 최대해상도x, 최대해상도y ) -> 필드변수 생성
	String company;
	int inch;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
//	3. 모니터는 만들때 필수 값이 필요합니다. -> 생성자 (매개변수) (제조회사, 인치, 가격)
	Monitor(String company, int inch, int price) {
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	
//	4. 색상과 해상도는 옵션으로 선택할 수 있어서, 이 후에 별도로 입력 받겠습니다. -> set메소드
//	setXY, setColor 값을 저장 할 수 있도록.
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		this.maxResolutionX = x;
		this.maxResolutionY = y;
	}
//	5. 모니터클래스에는 전원을 키는 기능이 있습니다. -> 전원켜기 메소드
//	전원이 켜진 후 "전원이 켜졌습니다"를 출력해줍니다.
	
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
//	6. 모니터 클래스에는 가격인상 기능이 있습니다. -> return금액 가격인상 메소드
//	입력된 만큼의 금액이 인상되고 인상된 후 최종 금액을 반환합니다.
	
	public int addPrice(int tempPrice) {
		this.price = this.price + tempPrice; //기존금액에 추가된 금액 +
		return this.price; //최종금액 리턴
	}
	
//	9. 모니터 클래스에는 자신의 정보를 정렬하여 출력해주는 기능이 있습니다. -> 출력기능 메소드.
	
	public void printInfo() {
		System.out.printf("제조사:%s %d인치 모니터 가격:%d원 색상:%s 해상도: %d * %d \n",
				company, inch, price, color, maxResolutionX, maxResolutionY);
	}
	
}
