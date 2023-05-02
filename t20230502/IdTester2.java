package t20230502;

public class IdTester2 {
	public static void main(String[] args) {
		Id2 a = new Id2();        //식별 번호 1번
		Id2 b = new Id2();        //식별 번호 2번
		
	    System.out.println("a의 식별 번호:" + a.getId2());
	    System.out.println("b의 식별 번호:" + b.getId2());
	    
	    System.out.println("마지막으로 부여한 식별 번호 = " + Id2.getMaxId2());
	    System.out.println("마지막으로 부여한 식별 번호 = " + a.getMaxId2());
	    System.out.println("마지막으로 부여한 식별 번호 = " + b.getMaxId2());

 }
}	
