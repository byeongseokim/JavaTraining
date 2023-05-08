package t20230508;

public class TriangleRU extends AbstTriangle {

	public TriangleRU(int length) {
		super(length);
	}

	public String toString() {
		return "TriangleRU(length:" + getLength() + ")";
	}

	@Override
	public void draw() {
		for (int i = getLength(); i >= 1; i--) {
			for (int j = 1; j <= getLength() - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();

		}

	}

}
