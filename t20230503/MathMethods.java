package t20230503;

import java.util.Scanner;

public class MathMethods {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("실 수:");
		double x = stdIn.nextDouble();

		System.out.println("절댓값:" + Math.abs(x));
		System.out.println("제곱근:" + Math.sqrt(x));
		System.out.println("넓 이:" + Math.PI * x * x);

	}

}
