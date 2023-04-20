package t20230420;
//0.0부터 1.0까지 0.001 단위로 증가시켜 가며 표시

public class LoopFloatInt {
	public static void main(String[] args) {
		System.out.println("float      int");
		System.out.println("-------------------------");
		
		float x = 0.0F;
		for (int i = 0; i<= 1000; i++, x += 0.001F)
			System.out.printf("%9.7f   %9.7f\n", x, (float)i / 1000);


	}

}
