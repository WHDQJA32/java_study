package study.quiz;

public class quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String brand = "로지텍";
		String name = "mx kyes";
		int price = 135000;
		String sn = "332L1545K";
		
		String companyName = "SAMSUNG";
		int m = 24;
		String color = "black";
		boolean hdmi = true;
		boolean soundCheck = false;
		
		/*
			open isOpened
			close isClosed
			hdmiPort hasHdmiPort
			playSound canPlaySound
			
		 */
		
		double pi = 3.14;
		System.out.println("원주율 : " + pi);
		
		String mathScore = "85";
		int value = Integer.parseInt(mathScore);
		String englishScore = "90";
		int value1 = Integer.parseInt(englishScore);
		String artScore = "70";
		int value2 = Integer.parseInt(artScore);
		
		System.out.println(value + value1 + value2);
		// int total = value + value1 + value2;
		// System.out.println("총점 :" + total); 또 다른 방법 good
		int num1 = 4;
		int num2 = 10;
		double num3 = (double)num1 / (double)num2;
		System.out.println(num3);
	}
	
}
