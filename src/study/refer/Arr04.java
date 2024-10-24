package study.refer;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//배열 참조타입 vs int 기본타입
		
		int a = 10;
		int b = a;
		System.out.println(a+" "+ b);
		
		b=20;
		System.out.println(a+ " " + b);
		
/*
		//복사가 안된 케이스
	
		int[] arr1 = {10, 20, 30};
		int[] arr2 =arr1;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
	
		
		//for문을 이용한 배열 복사하는 법
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			arr2[i] = arr1[i];
			//   0         0
			//	 1		   1
			// 	  int = int값
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
*/
		
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3];
		//			복사대상 인덱스위치 저장할대상 인덱스위치 갯수
		System.arraycopy( arr1, 0, arr2, 0, 3 );
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			arr2[i] = arr1[i];
			//   0         0
			//	 1		   1
			// 	  int = int값
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
		System.out.println();
	}

}
