package t20230414;
import java.util.Scanner;
class ThreeDigits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x;           //읽은 값
		do {
			System.out.print("세 자리의정숫값: ");
			x = stdIn.nextInt();
		
		}while (x <100 || x > 999); //x는 3자리 양의 정수이어야한다.
		
		System.out.print("입력한 값은 " + x + "입니다.");

	}

}
