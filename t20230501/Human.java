package t20230501;
//사람 클래스(ver.2)

public class Human {
	private String name;    //이름
	private int height;    //신장
	private int weight;    //체중
	private int lenght;
	

	//---생성자---//
	Human(String n, int h, int w) {
		name = n; height = h; weight = w;
		
			}
	String getName() { return name;}        //이름 가져오기
	int getHeight()  { return height;}      //신장 불러오기
	int getWeight()  { return weight;}      //신장 불러오기
	int getlenght()	 { return lenght;}
	
	void gainWeight(int w) {weight += w;}  //살이 찐다
	void reduceWeight(int w) {weight -= w;}  //살이 빠진다

}
