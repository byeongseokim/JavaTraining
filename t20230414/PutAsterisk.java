package t20230414;
//지정한 개수만큼 * 표시
import java.util.Scanner;

class PutAsterisk {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?: ");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i =0;
			while(i < n) {
			System.out.println('*');
			i++;
		}
		System.out.println();

	}
}
}
