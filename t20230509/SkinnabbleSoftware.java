package t20230509;

public class SkinnabbleSoftware implements Skinnable {
	int skin; // 스킨

	// 생성자
	public SkinnabbleSoftware() {
		this.skin = BLACK;
	}

	public SkinnabbleSoftware(int skin) {
		this.skin = skin;
	}

	@Override
	public void changeSkin(int skin) {
		this.skin = skin;
	}

	public int getSkin() {
		return skin;
	}

	public String getSkinString() {
		switch (skin) {
		case BLACK:
			return "BLACK";
		case RED:
			return "RED";
		case GREEN:
			return "GREEN";
		case BLUE:
			return "BLUE";
		case YELLOW:
			return "YELLOW";
		}

		return "";

	}
}