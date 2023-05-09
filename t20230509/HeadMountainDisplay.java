package t20230509;

//헤드마운트 디스플레이
public class HeadMountainDisplay implements Wearable, Skinnable {
	private int skin; // 스킨

	// 착용
	public void putOn() {
		System.out.println("디스플레이를 착용했습니다.");
	}

	// 해제
	public void putOff() {
		System.out.println("디스플레이를 벗었습니다.");
	}

	// 스킨 변경
	public void changeSkin(int skin) {
		this.skin = skin;
	}

	// 현재 스킨 표시
	public void putSkin() {
		switch (skin) {
		case BLACK:
			System.out.println("BLACK DISPLAY");
			break;
		case RED:
			System.out.println("RED DISPLAY");
			break;
		case GREEN:
			System.out.println("GREEN DISPLAY");
			break;
		case BLUE:
			System.out.println("BLUE DISPLAY");
			break;
		case YELLOW:
			System.out.println("YELLOW DISPLAY");
			break;
		}
	}
}
