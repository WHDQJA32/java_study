package study.quiz.test01;

public class GameUser {
	String id; //아이디
	String chainStore; //지점명
	int totalPoint; //총합포인트
	int SuccessTime; //성공횟수
	int failTime; //실패횟수
	int Remaining; //잔여시도횟수

	GameUser(String id, String chainStore){
		this.id = id;
		this.chainStore = chainStore;
		this.totalPoint = 0;
		this.SuccessTime = 0;
		this.failTime = 0;
		this.Remaining = 0;
	}
	
	void Charging(int q) { //충전하기
		if((totalPoint + q)<0) {
			totalPoint = 0;
		}else {
			totalPoint = totalPoint + q;
		}
	}
}
