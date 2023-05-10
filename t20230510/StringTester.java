package t20230510;

public class StringTester {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = "";
		String s3 = "ABC";
		String s4 = "ABC";
		String s5 = "ABC";
		s5 = "XYZ";

		System.out.println("문자열 s1 = " + s1);
		System.out.println("문자열 s2 = " + s2);
		System.out.println("문자열s3 = " + s3);
		System.out.println("문자열s4 = " + s4);
		System.out.println("문자열s5 = " + s5);
		System.out.println("s3와 s4는 같은 문자열 리터럴을 참조" + ((s3 == s4) ? "하고 있다." : "하고 있지 않다."));

	}

}
