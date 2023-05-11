package t20230511;

import java.util.Scanner;

public class MulDiv2 {

	static int mul(int x, int y) {
		return x * y;
	}

	static int div(int x, int y) {
		return x / y;
	}

	static void muldiv(int x, int y) {
		System.out.println("x * y = " + mul(x, y));
		System.out.println("x / y = " + div(x, y));

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		try {
			System.out.print("x값:");
			int x = stdIn.nextInt();
			System.out.print("y값:");
			int y = stdIn.nextInt();
			muldiv(x, y);
		} catch (Exception e) {
			System.out.println("입력 오류 발생." + e);
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}

}
