package t20230414;
import java.util.Scanner;

class EnumScope {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 A: "); int a = stdIn.nextInt();
		System.out.print("정수 B: "); int b = stdIn.nextInt();
		if (a > b) {  // a 가 b 보다 크면
			int t = a;  //두 값을 교환
			a = b;
			b = t;
		}
		do {
			System.out.print(a + " ");
			a = a + 1;
		}while (a <= b);
		
			System.out.println();
	

	}

}
