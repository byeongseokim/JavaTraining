package t20230420;
//배열의 모든 요소에 값을 읽어서 초깃값 형식으로 표시
import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n = stdIn.nextInt();       //요소 수 입력
		int[] a= new int[n];           //배열 생성
		
		
		for (int i= 0; i <n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		System.out.print("a = {");
		if (n >=2)
			for (int i = 0; i < n-1; i++)      //앞에서부토 n-1개 요소 표시
				System.out.print(a[i]+", ");
		if (n >=1)
			System.out.print(a[n - 1]);       //마지막 요소 표시
		System.out.print("}");
	}

}
