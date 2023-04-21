package t20230421;
//배열의 모든 요소를 1~10의 난수로 채우기(인접한 요소가 중복되지 않게 하기)
import java.util.Random;
import java.util.Scanner;


public class ArrayRandX {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn= new Scanner(System.in);
		
		System.out.print("요소  수:");
		int n = stdIn.nextInt();      //요소 수 읽기
		int[] a = new int[n];   //배열 생성
		
		a[0] = 1 + rand.nextInt(10);
		
		for (int i = 1; i < n; i++) {
			do {
				a[i] = 1 +  rand.nextInt(10);     //1~10난수
			}while(a[i]==a[i-1]);
		}

		for (int i=0; i<n; i++)
			System.out.println("a[" + i + "] = "+ a[i]);
	}

}
