package study.quiz;

public class quiz05 {

	public static void main(String[] args) {
	//	1.
	//	1 2 3 4
	//	5 6 7 8
	//	9 10 11 12
	//	13 14 15 16
		
		int[][] arr= new int[4][4];
		int num =1; //int num를 만들어 여기에 1씩 추가저장하는 방법.
	/*
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				//4*4
				//i:0~3 0    1    2    3	 
				//j:0~3 0123 0123 0123 0123
				arr[i][j] = num; //인덱스 위치 num이라는 인트값 저장.
				num++;	//int num 을 1씩 저장하여 반복하는 문.
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
			 System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	//	2.
	//	1 5 9 13
	//	2 6 10 14
	//	3 7 11 15
	//	4 8 12 16
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = (i+1)+(j*4); 
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
					 System.out.printf("%3d", arr[i][j]);
				}
				System.out.println();
		
		}
			}
	
	//	3.
	//	16 15 14 13
	//	12 11 10 9
	//	8 7 6 5
	//	4 3 2 1
		
		num=16;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
			//4*4
			//i:0~3 0    1    2    3	 
			//j:0~3 0123 0123 0123 0123
			arr[i][j] = num; //인덱스 위치 num이라는 인트값 저장.
			num--;	//int num 을 16부터 -1씩 빼라는 반복문.
			}
		}
		
		num = 1;
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
			arr[i][j] = num; 
			num++;	
			}
		}
			
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
						 System.out.printf("%3d", arr[i][j]);
					}
					System.out.println();	
			}
		}
	*/
			
			
	//	4.
	//	16 12 8 4
	//	15 11 7 3
	//	14 10 6 2
	//	13 9 5 1	
			
		num = 1;
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
			arr[j][i] = num; 
			num++;	
			}
		}
			
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
						 System.out.printf("%3d", arr[i][j]);
					}
					System.out.println();	
			}
		}	
			
			
		/*
		
		int nArr1[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		
		for(int i=0; i<nArr1.length; i++) {
			for(int j=0; j<nArr1[i].length; j++) {
				
				System.out.print(nArr1[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		
		int nArr2[][] = {{1,5,9,13}, {2,6,10,14}, {3,7,11,15}, {4,8,12,16}};
		
		for(int i=0; i<nArr2.length; i++) {
			for(int j=0; j<nArr2[i].length; j++) {
				
				System.out.print(nArr2[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		
		int nArr3[][] = {{16,15,14,13}, {12,11,10,9}, {8,7,6,5}, {4,3,2,1}};
		
		for(int i=0; i<nArr3.length; i++) {
			for(int j=0; j<nArr3[i].length; j++) {
				
				System.out.print(nArr3[i][j]+" ");
			}System.out.println();
		}
		System.out.println();

		int nArr4[][] = {{16,12,8,4}, {15,11,7,3}, {14,10,6,2}, {13,9,5,1}};
		
		for(int i=0; i<nArr4.length; i++) {
			for(int j=0; j<nArr4[i].length; j++) {
				
				System.out.print(nArr4[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
*/
}

