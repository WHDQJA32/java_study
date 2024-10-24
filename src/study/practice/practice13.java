package study.practice;

import java.util.Scanner;

public class practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
	 	/*
	 	//1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		
		// for(시작; 어떤조건; 증감)
		
		//		*****
		//		****
		//		***
		//		**
		//		*
			for(int i=5; i>=1; i--) { //i: 5 4 3 2 1
				for(int j=1; j<=i; j++) { //j:1 2 3 4 5
					//i:5 j:1 2 3 4 5
					//i:4 j:1 2 3 4
					//i:3 j:1 2 3
					//i:2 j:1 2 
					//i:1 j:1 
					
					System.out.print("*");
				}
				System.out.println();
			}
		
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=(6-i); j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			
			
			for(int i=1; i<=5; i++) {
				for(int j=5; j>=i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			for(int i=1; i<=5; i++) {
				for(int j=(6-i); j>=1; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
		
		
		//2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		// 		*
		// 		**
		// 		***
		// 		****
		 		
		for(int x=1; x<5; x++) { //줄 반복 5줄
			for(int y=0; y<x; y++) { //별 반복 x만큼 x=1 , x=2 ...
		 		System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		//3. 입력된 수의 약수를 출력하시오.
		//ex) 입력 : 6
		//1 2 3 6
		
		System.out.print("입력 : ");
		int num = scanner.nextInt();
		
		System.out.println(num+"의 약수");
		for(int i=1; i<=num; i++) {
			if(num % i == 0)
				System.out.print(i+" ");
		}
		
		//4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		//숫자를 입력받고 아래 문양으로 * 출력하기
		//ex) 입력 : 5
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*

		//입력 : 3

		//*
		//**
		//***
		//**
		//*

		System.out.print("입력 : ");
		int num = scanner.nextInt();
		
		//~num 늘어나는 형태
		for(int i=1; i<=num; i++) { //i: 1 2 3 4 5
			for(int j=1; j<=i; j++) { //j 1 12 123 1234 12345
				System.out.print("*");
			}
			System.out.println();
		}
		//num-1 줄어드는 형태
		
		for(int i=num-1; i>=1; i--) { //i : 4 3 2 1 
			for(int j=1; j<=i; j++) {
				System.out.print("*");
		}
		System.out.println();
		}

		//5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				//System.out.print();
			sum = sum + j;
			}
			//System.out.println();
		}
		System.out.println("총합 : " + sum);
*/	
		//다른 방법
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum = sum +( i * (10-(i-1)));
		}
		System.out.println("총합 : " + sum);
		
		sum = 0;
		int currentSum = 0;
		for(int i=1; i<=10; i++) { // i:1~10
		
			currentSum = currentSum + i; // 1, 1+2 ,1+2+3, 1+2+3+4 ....
			sum = sum + currentSum;
		}
		System.out.println("총합 : " + sum);

		//6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		//100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		
		int total = 0;
		int i;
		
		for(i=1; total<100; i++) { //i:200
			
			if(i % 2 == 0) { // 짝수면 -
				total = total - i;	// -198 => -99
			}else { // 홀수면 +		
				total = total + i;
			}
		}
		System.out.println("누적합 : " + total + "얼마까지 계산했는가 : " + (i-1));
		
		total = 0;
		i=0;
		while(true) {
			i++;
			if(i%2 == 0) { // 짝수
				total = total - i ;	//짝수면 빼기
			}else {		   // 홀수
				total = total + i ; //홀수면 더하기
			}
			
			if(total >= 100) {
				break;
			}
			
			i++;
		}
		System.out.println("누적합 : " + total + "얼마까지 계산했는가 : " + i);
	
	
	}
}


