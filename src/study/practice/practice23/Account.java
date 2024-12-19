package study.practice.practice23;

public class Account {
	
	private String owner;
	private long balance; //int 보다 더 큰 숫자를 표현할수 있다. long타입
	
	public Account() { //초기값 주기
		owner = null;
		balance = 0;
	}
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long amount) { //저축 입금
		balance += amount;
		
		// 기존 : 30000 입금 : 10000
		// return 1) 입금액, 2) 입금 후 최종잔액
		return amount;
	}
	public long withdraw(long amount) { //출금 금액
		
		//5000 9000원 출금 시도
		//1) 잔액 부족 -> 출금 실패
		//2) 잔액 부족 -> 최대 잔액만큼 출금
		
		if(amount > balance) {//출금 불가
			System.out.println("잔액이 부족합니다.");
			return 0;
			/*
			System.out.println("잔액이 부족합니다. 남은 모든 잔액 출금합니다.");
			amount = balance;
			balance = 0;
			return amount;
			*/
		}
		balance -= amount;
		return amount;
	}
	
	
}
