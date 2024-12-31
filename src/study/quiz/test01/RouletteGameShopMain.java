package study.quiz.test01;

public class RouletteGameShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RouletteGameShop rg = new RouletteGameShop();
		
		//유저 추가
		rg.addUser("김하나", "천안점");
		
		//영업시작
		rg.startGame();
	}

}
