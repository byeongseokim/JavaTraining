package t20230511;

import java.util.Scanner;

public class RangeErrorTester {
	static boolean isValid(int n) {
		return n >= 0 && n <= 9;
	}

	static int add(int a, int b) throws ParameterRangeError, ResultRanngeError {
		if (!isValid(a))
			throw new ParameterRangeError(a);
		if (!isValid(b))
			throw new ParameterRangeError(b);
		int result = a + b;
		if (!isValid(result))
			throw new ResultRanngeError(result);
		return result;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수 a:");
		int a = stdIn.nextInt();
		System.out.println("정수 b:");
		int b = stdIn.nextInt();

		try {
			System.out.println("합은" + add(a, b) + "입니다.");
		} catch (RangeError e) {
			System.out.println("범위 밖 예외가 발생했습니다.\n" + e.getMessage());
		}

	}

}
