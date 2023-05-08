package t20230508;

import java.util.*;

public class HumanPlayer extends Player {
	private static Scanner stdIn;
	static {
		stdIn = new Scanner(System.in);
	}

	@Override
	public int nextHand() {
		do {
			System.out.println("가위바위보!!!0...가위/1...바위/2...보:");
			hand = stdIn.nextInt();
		} while (hand < 0 || hand > 2);
		return hand;

	}

}
