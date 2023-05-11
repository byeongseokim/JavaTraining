package t20230511;

import java.util.Scanner;

public class ThrowAndCatch {

	static void check(int sw) throws Exception {
		switch (sw) {
		case 1:
			throw new Exception("검사 예외 발생!!");
		case 2:
			throw new RuntimeException("비검사 예외 발생!!");

		}
	}

	static void test(int sw) throws Exception {
		check(sw);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sw = stdIn.nextInt();
		try {
			test(sw);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
