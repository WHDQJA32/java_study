package study.refer;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i=0; i<5; i++) { //index: i: 0 1 2 3 4
			System.out.print("arr[" + i + "]" + arr[i] + " ");
		}
		System.out.println();
		
		//int arr 값을 넣어준다. 향상된 for문!!! 끝날때 까지 돈다.
		for(int value : arr) { //{10, 20, 30, 40, 50}
			
			//전체 갯수만큼 처음부터 끝까지 다 반복
			//값만 주어지고,  인덱스는 모른다.
			
			System.out.print(value + " ");
		
		}
		
		int index=0; //인덱스 확인방법
		for(int value : arr) { //{10, 20, 30, 40, 50}
			
			//인덱스 다 복사할 때 사용.
			
			System.out.print(value + " ");
			index++;
		}
		int[] scores = {90, 95, 100, 80, 75};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++) {
			//sum = sum + i; 0+1+2+3+4
			sum = sum+ scores[i]; // 90+95+100+80+75
		}
		System.out.println(sum);
		
		sum = 0;
		for(int score : scores) {
			sum = sum + score;
	}
		System.out.println(sum);
		
		//{90, 95, 100, 80, 75};
		//점수 채점 잘못되서, 모든 점수를 -5 점씩 감점
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i]-5;
			System.out.print(scores[i] + " ");
		}
		//{85, 90, 95, 75, 70};
		System.out.println();
		
		for(int score : scores) {
			score = score -5;
		}
		
		//{80, 85, 90, 70, 65}; 를 원했는뎅.
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
	}
	
}