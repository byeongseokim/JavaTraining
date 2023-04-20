package t20230420;
//배열의 각 요소에 5,4,3,2,1을 대입해서 표시
public class IntArrayFor {
	public static void main(String[] args) {
		int[] a = new int[5];     //배열 선언
		
		
		for (int i = 0; i < a.length; i++)
			a[i] = 5 - i;
		
		for(int i =0; i<a.length; i++)
			System.out.println("a[" + i + "]=" +a[i]);

	}

}
