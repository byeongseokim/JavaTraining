package t20230420;
//배열의 모든 요소에 난수를 대입한 후 막대 그래프로 표시
import java.util.Random;
import java.util.Scanner;

public class ColumnChart {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn= new Scanner(System.in);
		
		
		System.out.print("요소 수:");
		int n = stdIn.nextInt();      //요소 수 읽기
		int[] a= new int[n];     //배열 생성
		
		
		
		for (int i = 0; i <n; i++)
			a[i] = 1 + rand.nextInt(10);   //1~10 난수
		
		
		for (int i= 10; i>=1; i--) {
			for (int j = 0; j < n; j++)
				if (a[j] >= i)
					System.out.print("* ");
				else
					System.out.print("  ");
			        System.out.println();
		
	
			
		}
		for (int i = 0; i < 2 * n; i++)
			System.out.print('-');
		    System.out.println();
		    
		    for (int i= 0; i < n; i++)
		    	System.out.print(i %10 + " ");
		        System.out.println();

	}

}
