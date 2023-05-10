package t20230510;

public class SumOfArgs {
	public static void main(String[] args) {
		double sum = 0.0;
		for (String s : args)
			sum += Double.parseDouble(s);
		System.out.println("합계는 " + sum + "입니다.");

	}

}
