package t20230421;
//배열의 모든 요소를 역순으로 복사해서 표시
import java.util.Scanner;

public class CopyArrayReverse {
	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n  = stdIn.nextInt();        //요소 수 읽기
		int[] a = new int[n];            //배열 a생성
		int[] b = new int[n];            //배열 b생성
		
		for (int i = 0; i < n; i++) {    //배열 a에 값 읽기
			System.out.print("a[" + i + "] = ");
			a[i]= stdIn.nextInt();
		}
		
		
		//배열 a의 모든 요소를 역순으로 배열 b에 복사
		for (int i = 0; i< n; i++) {
			b[i]= a[n-i-1];
		}
		
		System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
		
		for (int i = 0; i < n; i++)     //배열 b를 표시
			System.out.println("b[" + i + "] = " + b[i]);

	}

}
