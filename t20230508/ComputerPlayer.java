package t20230508;

import java.util.Random;

public class ComputerPlayer extends Player {
	private static Random rand;
	static {
		rand = new Random();

	}

	@Override
	public int nextHand() {
		// 손 결정(난수를 통해 생성)
		return rand.nextInt(3);
	}

}
