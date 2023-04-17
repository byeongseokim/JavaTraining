package t20230417;
//양의 정숫값을 0부터 카운트업
import java.util.Scanner;

public class CountUp {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트업 합니다.");
		int x;
		do {
			System.out.print("양의 정숫값: ");
			x = stdIn.nextInt();
		
		}while (x <= 0);
		
		for (int i = 0 ; i <= x ; i++)
			System.out.println(i);           //i값 표시


	}

}
