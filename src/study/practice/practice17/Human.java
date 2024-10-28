package study.practice.practice17;

public class Human {
	
	String name;
	String mw;
	int age;
	double tall;
	double height;
	String job;
	String abo;
	int health;
	boolean sleep;
	
	Human(String name,String mw, int age, int tall, int height, 
			String job, String abo, int health, boolean sleep ){
		this.name = name;
		this.mw = mw;
		this.age = age;
		this.tall = tall;
		this.height = height;
		this.job = job;
		this.abo = abo;
		this.health = health;
		this.sleep = sleep;
	}
	
	void printInto() {
		System.out.printf("이름:%s 성별:%s 나이:%d 키:%.2f 몸무게:%.2f 직업:%s 혈액형:%s 건강상태:%d 수면증여부:%s",
				name, mw, age, tall, height, job, abo, health, sleep);
	}
	
	
}
