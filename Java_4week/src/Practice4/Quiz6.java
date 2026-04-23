package Practice4;

import java.util.Scanner;
// 사계절
public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("숫자를 입력해주세요 : ");
		int month = scanner.nextInt();
		
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
	
		}
		
		scanner.close();

	}

}
