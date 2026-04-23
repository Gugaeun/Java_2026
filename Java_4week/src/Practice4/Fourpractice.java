package Practice4;

public class Fourpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int z = 0;
		for(int i = 1; i <= 100; i++) {
			z += i;
		}
		System.out.println(z);
		*/
		
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
			System.out.print(i);
			
			if(i <= 9)
				System.out.print("+");
			else { // i 가 10인 경우
				System.out.print("=");
				System.out.print(sum);
			}
			
		} 

	}

}
