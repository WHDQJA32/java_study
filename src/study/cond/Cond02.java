package study.cond;

public class Cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice = 5;
		
		if (dice == 1) {
			System.out.println("한칸 전진");
		}
		
		if (dice == 1) {
			System.out.println("한칸 전진");
		} else {
			System.out.println("주사위 수 대로 전진");
		}
		
		if(dice == 1) { //1
			
		} else if (dice == 2) { //2
		
		} else if (dice == 3) { //3
			
		} else { // 그 외에 4,5,6
		}
		
		if(dice == 1) {
		}else if (dice == 2) {
		}else if (dice == 3) {
		}else if (dice == 4) {
		}else if (dice == 5) {
		}else if (dice == 6) {
		}
		
		
		if(dice == 1) {
		}else if (dice == 2) {
			// 실행문
		}else if (dice == 3) {
		}else if (dice == 4) {
		}else if (dice == 5) {
		}else { // 6 위 사항을 전부 다 아니라면 이걸 출력하겠다.
			System.out.println("이거라도 먹고 떨어져");
		}
		System.out.println("=======switch======");
		
		dice =4;
		
		switch(dice) {
		case 1:
			System.out.println("case 1");
			break; // 출력을 멈추고 이탈한다.
		case 2:
			System.out.println("case 2");
			break; // 출력을 멈추고 이탈한다.
		case 3:
			System.out.println("case 3");
			break; // 출력을 멈추고 이탈한다.
		case 4:
			System.out.println("case 4");
			break; // 출력을 멈추고 이탈한다.
		case 5:
			System.out.println("case 5");
			break; // 출력을 멈추고 이탈한다.
		case 6:
			System.out.println("case 6");
			break; // 출력을 멈추고 이탈한다.
		default: // else 랑 같은 출력이 나옴.
			System.out.println("default");
		}
		
		//8시 출근 : 청소
		//9시 출근 : 회의
		//10시 : 업무
		//11시 : 외근
		
		int showTime = 8;
		
		if (showTime <= 8) {
			//청소
		}
		if (showTime <= 9) {
			//회의
		}
		if (showTime <= 10) {
			//업무
		}
		if (showTime <= 11) {
			//외근
		}
		
		// int showTime = 8;
		
		if (showTime <= 8) {
			//청소
			//회의
			//업무
			//외근
		}else if (showTime <= 9) {
			//회의
			//업무
			//외근
		}else if (showTime <= 10) {
			//업무
			//외근
		}else if (showTime <= 11) {
			//외근
		}
		
		switch (showTime) {
		case 8:
			//청소
		case 9:
			//회의
		case 10:
			//업무
		case 11:
			//외근
		}
		
		switch (showTime) {
		case 8:
			//청소
			break;
		case 9:
			//회의
		case 10:
			//업무
		case 11:
			//외근
		}
		
		int goBedTime = 21; //잠든시간
		int sleepTime = 9; //잔 시간

		if(goBedTime <= 21) {
			//일찍 잤구나
			if(sleepTime >= 9) {
				//많이 잤구나
			 if(sleepTime >= 12) {
				//너무 많이 잔거같은데~
				}
			}else {
				//조금 잤구나~
			}
		
		} else {
			//좀 늦게 잤구나
			if(sleepTime >= 9) {
				//많이 잤구나
			} else {
				//조금 잤구나
			}
		}
		
		//일찍	많이/조금
		//늦게	많이/조금
		
		// x == 10	x != 10		!(x==10)
		// x < 10	x > 10		!(x<10)
		// x > 11	x <= 11		!(x > 11)
		
		if(goBedTime <= 21 && sleepTime >= 9) {
			//일찍 / 많이
		} else if (goBedTime <=21 && !(sleepTime >=9)) {
		//else if (goBedTime <=21 && sleepTime < 9) {
			//일찍 / 조금
		} else if (goBedTime > 21 && sleepTime >= 9) {
			//늦게 / 많이
		}
		
	
	}
}