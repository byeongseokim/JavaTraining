package t20230502;
//일련 번호 클래스 (ver.1)

public class Id {
	static int counter = 0;    //몇 번까지 식별 부여를 부여했는가
	static int id;             //식별 번호
	
	//---생성자---//
	public Id() {
		id = ++counter;        //식별 번호
	}
	
	//---식별 번호 가져오기---//
	public int getId() {
		return id;
	}

}
