package t20230510;

public class Circle {
	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		System.out.printf("반지름 %.2f인 원의 둘레는 %.2f이고 넓이는 %.2f입니다.\n", r, 2 * Math.PI * r, Math.PI * r * r);

	}

}
