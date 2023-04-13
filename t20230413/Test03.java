package t20230413;
// 읽은 두 값의 차가 10이하인지를 표시 (if문)
import java.util.Scanner;


public class Test03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a: "); int a = stdIn.nextInt();
		System.out.print("정수 b: "); int b = stdIn.nextInt();
		
		int diff = a >= b ? a -b : b - a;
		
		if(diff <=10)
			System.out.println("두 값의 차는 10 이하입니다.");
		else
			System.out.println("두 값의 차는 11 이상입니다.");

	}

}
