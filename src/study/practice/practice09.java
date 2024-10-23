package study.practice;

import java.util.Scanner;

public class practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1번
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numArr = new int[5];
		
		System.out.print("5개 정수를 입력하세요 : ");
		//				5
		for(int i=0; i<numArr.length; i++) {
			//i: 0 1 2 3 4
			numArr[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째 수인가요? : ");
		int index = scanner.nextInt();
		System.out.println("결과 : "+ numArr[index-1]);
		
		//인덱스 기준 : 0 1 2 3 4
		//순번 기준 :  1 2 3 4 5
		
		/*		//2번
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numArr = new int[5];
		System.out.print("5개 정수를 입력하세요 : ");
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = scanner.nextInt();
		
		}
		//i:4 3 2 1 0
		System.out.print("결과 : ");
		for(int i=4; i>=0; i--) {
			System.out.print(numArr[i] + " ");
		}
		
		//3번
		
		//int[][] nArr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		int[][] nArr = new int[4][4]; 
		
		int num = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				//i		:0 0 0 0 1 1 1 1...
				//j     :0 1 2 3 0 1 2 3...
				//num   :1 2 3 4 5 6 7 8...
				nArr[i][j] = num++;
			}
		}
		//i : 0 1 2 3
		//j : 0 1 2 3
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				//System.out.print(nArr[i][j]+ " ");
				System.out.printf("%3d",nArr[i][j]);
			}
			System.out.println();
		}
*/
		}
	}
		
			

	

