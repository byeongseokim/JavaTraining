package t20230511;

import java.util.Scanner;

public class MulDiv1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("x값:");
		int x = stdIn.nextInt();
		System.out.println("y값:");
		int y = stdIn.nextInt();

		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));

	}

}
