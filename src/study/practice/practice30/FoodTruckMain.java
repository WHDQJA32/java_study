package study.practice.practice30;

public class FoodTruckMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodTruck ft = new FoodTruck();
		
		//메뉴추가 메소드
		ft.addMenu("김밥", 3000);
		ft.addMenu("짜장면", 6000);
		ft.addMenu("핫도그", 2000);
		
		//영업시작
		ft.startSalse();
		
		
	}

}
