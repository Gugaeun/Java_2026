package Practice;

import java.util.Scanner;

public class Dollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double cha = 1200;
		
		System.out.print("원화를 입력하세요(단위 원) : " );
		int won = scanner.nextInt();	
		double dol = won / cha;
		
		System.out.println(won + "원은 " + "$" +  dol + "입니다.");
		
		scanner.close();
	}

}
