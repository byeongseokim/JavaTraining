package t20230426;
//두 배열의 전체 요솟값을 교환
import java.util.Scanner;

public class aryExching {
	
	//---베열a와 b의 전체 요솟값을 교환 ---//
	static void aryExching(int[] a, int[] b) {
		int n = a.length < b.length ? a.length : b.length;
		for (int i = 0; i < n; i++) {
			int t = a[i]; a[i] = b[i]; b[i] = t;
	}
  }		

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 요소 수:");
		int na = stdIn.nextInt();                 //배열 a의 요소 수
		int[] a = new int[na];                    //요소 수가 na인 배열
		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 b의 요소 수:");
		int nb = stdIn.nextInt();                 //배열 b의 요소 수
		int[] b= new int[nb];                     //요소 수가 nb인 배열
		for (int i = 0; i< nb; i++) {
			System.out.print("b[" + i + "]:");
			b[i] = stdIn.nextInt();
		}
		
		aryExching(a, b);
		System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
		for (int i = 0; i < na; i++)            //배열 a를 표시
			System.out.print("a[" + i + "]= " + a[i]);
		
		for (int i = 0; i < nb; i++)     //배열 b를 표시
			System.out.println("b[" + i + "]= " + b[i]);
			


	}

}
