package Practice4;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java_3week 에 있는 Dollar 가 이 문제 풀어본 파일
		
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// Scanner 로 값 입력 받기(double 사용)
		System.out.print("원화를 입력하세요(단위 : 원) : ");
		double won = scanner.nextDouble();

		
		//원화를 달러로 변환(1$ -> 1490원)
		double dol = won / 1490;
		//결과 출력
		System.out.println(won + "원은 " + "$" +  dol + "입니다.");
		// System.out.printf("%d원은 $0.2d입니다.", won, dol);
		
		scanner.close();

	}

}
