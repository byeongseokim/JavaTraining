package t20230427;
//정수형의 내부 비트를 표시하는 메서드 (다중 정의)
import java.util.Scanner;

public class PrintBits {
	//---byte형의 비트 구성 표시---//
	static void printBits(byte x) {
		for (int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
	}
	
	//---short형의 비트 구성 표시---//
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1)? '1' : '0');
	}
	//---long형의 비트 구성 표시---//
		static void printBits(long x) {
			for (int i = 63; i >= 0; i--)
				System.out.print(((x >>> i & 1) == 1)? '1' : '0');
		}
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("byte  형 정수 a의 값:"); byte  a = stdIn.nextByte();
		System.out.println("short 형 실수 b의 값:"); short b = stdIn.nextShort();
		System.out.println("int   형 실수 c의 값:"); int   c = stdIn.nextInt();
		System.out.println("long  형 실수 d의 값:"); long  d = stdIn.nextLong();
		
		System.out.println( "a의 비트:"); printBits(a);
		System.out.println("\nb의 비트:"); printBits(b);
		System.out.println("\nc의 비트:"); printBits(c);
		System.out.println("\nd의 비트:"); printBits(d);
		System.out.println();
		

	}

}
