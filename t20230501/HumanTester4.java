package t20230501;
//사람 클래스 (ver.4) 사용
public class HumanTester4 {
	public static void main(String[] args) {
		Human4 gildong = new Human4("홍길동", 170, 60);
		Human4 chulsu = new Human4("김철수", 166, 72);
		
		gildong.putDate();    //gildong 의 데이터 표시
		System.out.println("번호:" + gildong.getId());
		
		System.out.println();
		
		chulsu.putDate();       //chulsu의 데이터 표시
		System.out.println("번호:" + chulsu.getId());
		

	}

}
