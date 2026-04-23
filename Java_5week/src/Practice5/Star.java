package Practice5;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <5; i++) {
			for(int j = 0; j < 5; j++) {// int j = 4; j >= 0; j-- <- 왼쪽 방향 사각형
				if(j == 0 || i == 4 || i == j) 
					System.out.print("*");
				else
					System.out.print(" ");
			}		
		
			System.out.println();
		}
		
		// 나비 모양 그려보기

//		for(int i =0; i < starArray.length; i++) {
//			for(int j = 0; j <starArray[i].length; j++) {
//				System.out.print(starArray[i][j]);
		
//		System.out.println();

			
			}
//		}
	}


