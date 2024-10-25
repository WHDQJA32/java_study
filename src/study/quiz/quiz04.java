package study.quiz;

public class quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int[][] nArr1 = { {1,2,3}, {4,5,6} }; 인덱스 값 직접 넣는방법
		
		int nArr1[][] = new int[5][5]; //인덱스 구성 선언
			
			for(int i=0; i<nArr1.length; i++) {
				for(int j=0; j<nArr1[i].length; j++) {
					
					//for(int i=0; i<5; i++) { i: 0~4
						//for(int j=0; j<5; j++) { j: 0~4
				
				if(i == j) {
					nArr1[i][j] = 1;
				}else if (i > j) {
					nArr1[i][j] = 3;
				}else
					nArr1[i][j] = 2;
				
				System.out.print(nArr1[i][j]+" ");
				
			}System.out.println();
	
		}
		
	}

}
