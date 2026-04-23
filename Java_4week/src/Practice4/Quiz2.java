package Practice4;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 금액 입력 받기
		System.out.println("급액을 입력해주세요 : ");
		int won = scanner.nextInt();
		
		// 50000원
		int fiveml = won / 50000;
		System.out.println("만원권 " + fiveml + "매");
		int re = won % 50000;
		
		//10000원
		int oneml = re / 10000;
		System.out.println("만원권 " + oneml + "매");
		re = re / 10000;
		
		//1000원
		int onel = re / 1000;
		System.out.println("천원권 " + onel + "매");
		re = re / 1000;
		//100원
		int one1 = re / 100;
		System.out.println("백원 " + one1 + "매");
		re = re / 100;
		//50원
		int fi = re / 50;
		System.out.println("오십원 " + fi + "매");
		re = re / 1000;
		//1원
		int one = re / 1;
		System.out.println("일원 " + one + "매");
		re = re / 1;
		
		scanner.close();
	}

}
