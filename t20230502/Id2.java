package t20230502;

public class Id2 {
	    static int counter = 0;    //몇 번까지 식별 부여를 부여했는가
		static int id2;             //식별 번호
		
		//---생성자---//
		public Id2() {
			id2 = ++counter;        //식별 번호
		}
		
		//---식별 번호 가져오기---//
		public int getId2() { return id2; }
		
		
		public static int getMaxId2() {
			return counter;
		}

}
