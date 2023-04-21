package t20230421;
//배열의 모든 요소에 1~10의 난수 채우기
import java.util.Random;
import java.util.Scanner;


public class ArrayRand {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n = stdIn.nextInt();      //요소 수 읽기
		int[] a = new int[n];       //배열 생성
		
		
		for (int i = 0; i < n; i++)
			a[i] = 1+ rand.nextInt(10);     //1~10난수
		
		
		for (int i = 0; i < n; i++)
			System.out.println("a[" + i + "] = "+ a[i]);
		

	}

}
