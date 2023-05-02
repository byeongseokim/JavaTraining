package t20230502;
//각 정수형이 표현할 수 있는 수치 범위를 표시
public class IntegerLimits {
	public static void main(String[] args) {
		System.out.println("정수형의 표현 범위");
		System.out.println("byte 형:" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short형:" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("int  형:" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("long 형:" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
	}
}