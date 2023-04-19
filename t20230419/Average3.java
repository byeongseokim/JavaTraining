package t20230419;
//3개의 정수값을 읽어서 평균을 실수로 표시
import java.util.Scanner;


public class Average3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("정숫값 x,y,z의 평균을 구합니다.");
		System.out.print("x값:"); int x = stdIn.nextInt();
		System.out.print("y값:"); int y = stdIn.nextInt();
		System.out.print("z값:"); int z = stdIn.nextInt();
		
		
		double ave = (x + y + z) / 3.0;             //평균값
		System.out.printf("x, y, z의 평균은 %.3f입니다.\n", ave); //표시
			


	}

}
