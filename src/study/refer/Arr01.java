package study.refer;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array 배열
		
		int score1 =100;
		int score2 = 85;
		int score3 = 76;
		int score4 = 25;
		int score5 = 75;
		
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5 ;
		double avg = sum / 5.0;
		
		System.out.printf("총점:%d 평균:%.2f\n", sum, avg);
		
		sum = sum + score1; //sum + = score1;
		sum = sum + score2;
		sum = sum + score3;
		sum = sum + score4;
		sum = sum + score5;
		
		//scores scoreArr scoreArray
		int[] scoreArr = {100, 85, 76, 25, 75};
		
		sum = 0; // 초기화
		sum =  scoreArr[0] + scoreArr[1] 
				+ scoreArr[2] + scoreArr[3] +scoreArr[4];
		
		sum = 0; // sum 변수 값 초기화
		sum = sum + scoreArr[0];
		sum = sum + scoreArr[1];
		sum = sum + scoreArr[2];
		sum = sum + scoreArr[3];
		sum = sum + scoreArr[4];
		
		sum = 0;
		for(int i=0; i<5; i++) {
			sum = sum + scoreArr[i]; 
			//					0 1 2 3 4 인덱스 값을 반복해서 더한다.
		}
		System.out.println("총합:"+sum);
		
		int[] pointArr = null;
		// pointArr = {1,2,3,4,5}; 안되는 형식
		
		pointArr = new int[] {1,2,3,4,5};   //가능
											//or
		pointArr = new int[5];				//가능
		pointArr[0] = 1;
		pointArr[1] = 2;
		pointArr[2] = 3;
		pointArr[3] = 4;
		pointArr[4] = 5;
		
		
		for(int i=0; i<5; i++) {
			// i : 0 1 2 3 4
			// 값 : 1 2 3 4 5
			pointArr[i]=i+1; //반복문과 값을 맞추는 방법
							 // 0 = 0+1
							 // 1 = 1+1
		}
		
		for(int i=1; i<=5; i++) {
			// i : 	   1 2 3 4 5 저장할 값
			// index : 0 1 2 3 4
			pointArr[i-1] = i; //1-1 =1
							   //2-1 =2
		}
		
		for(int i=0; i<5; i++) {
			System.out.print( pointArr[i]+ " ");
		}
		System.out.println();
		
		int[] intArr = new int[6];
		double[] doubleArr = new double[10];
		String[] strArr = new String[30];
		boolean[] boolArr = new boolean[4];
		
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.print(doubleArr[i] + " ");		
		}
		System.out.println();
		
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		
		boolArr[2] = true; //boolArr 인덱스 2번만 true로 바뀜.
		for(int i=0; i<boolArr.length; i++) {
			System.out.print(boolArr[i] + " ");
		}
		System.out.println();
		
	}

}
