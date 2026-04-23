package Practice4;

import java.util.Scanner;


public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		//원의 중심과 반지름 입력
		System.out.println("원의 중심과 반지름을 입력하세요 : ");
		int ronx = scanner.nextInt();
		int rony = scanner.nextInt();
		
		double ronz = scanner.nextDouble();
				
		// 점의 좌표 입력
		System.out.println("점의 좌표를 입력하세요 : ");
		int lonx = scanner.nextInt();
		int lony = scanner.nextInt();
		
		// 범위 안, 밖 판단
		int str_x = ronx - lonx;
		int str_y = rony - lony;
		
		//삼각비를 이용한 원점에서의 거리 구하기
		double dm = (str_x * str_x) + (str_y * str_y);
		//double dm = Math.sqrt(Math.pow(str_x, 2) + Math.pow(str_y, 2));
		//Math 클래스로도 만들 수 있음
		
		System.out.printf("확인 : ", dm);
		
		
		// 결과 출력
		if(ronz * ronz > dm) {
			System.out.printf("점(%d, %d)는 원 안에 있습니다.", ronx, rony);
			
		}
		else {
			System.out.printf("점(%d, %d)는 원 밖에 있습니다.", ronx, rony);
		}
	}

}
