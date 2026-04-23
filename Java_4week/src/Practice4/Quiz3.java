package Practice4;

import java.util.Scanner;

//삼각형
public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력해주세요 : ");
		
		int p1 = scanner.nextInt();
		int p2 = scanner.nextInt();
		int p3 = scanner.nextInt();
		
		
		//삼각형 판단( 두 정수의 합이 나머지 정수보다 커야 한다.) 와 결과 출력
		if(p1+p2 > p3) {
			if(p1 +p3 > p2) {
				if(p2+p3 > p1) {
					System.out.println("삼각형입니다.");
				}
				else {
			System.out.println("삼각형이 아닙니다.");
				}
			}
		}
		// 비교 연산자를 사용하면 더 간결해짐
	/*	if(p1+p2 > p3 && p1 +p3 > p2 && p2+p3 > p1) {
				System.out.println("삼각형입니다.");
		}
		else {
			System.out.println("삼각형이 아닙니다.");
		}

		*/
		scanner.close();
		
		
		
	}

}
