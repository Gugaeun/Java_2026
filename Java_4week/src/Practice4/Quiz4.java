package Practice4;

import java.util.Scanner;

// 사각형
public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("좌표를 입력해주세요(x, y) : ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if((x >= 100) && (x < 200) && (y >= 100) && (y < 200)) {
			//System.out.println("(" + x + ", " + y + ")는 사각형 안에 있습니다.");
			System.out.printf("(%d, %d) 는 사각형 안에 있습니다.", x, y);
		}
		else {
			//System.out.println("(" + x + ", " + y + ")는 사각형 안에 없습니다.");
			System.out.printf("(%d, %d) 는 사각형 안에 있습니다.", x, y);
		}
		
		scanner.close();
		
	}

}
