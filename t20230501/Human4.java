package t20230501;

public class Human4 {
	private static int counter = 0;    //몇 번까지 식별 벊를 부여했는가
	private String name;               //이름
	private int height;                //신장
	private int weight;                //체중
	private int id;                    //식별 번호
	
	public Human4(String name, int height, int weight) {
	    this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
	}
	
	public String getName() { return name; }   //이름 가져오기
	public int getHeight() { return height; }  //신장 불러오기
	public int getWeight() { return weight; }  //체중 불러오기
	
	public void gainWeight(int w)  {weight += w;}  //살이 찐다
	public void reduceWeight(int w)  {weight -= w;}  //살이 빠진다
	
	public int getId() {return id;}    //식별 번호 가져오기
	
	//---데이터 표시---//
	public void putDate() {
		System.out.println("이름:" + name);
		System.out.println("신장:" + height + "cm");
		System.out.println("체중:" + weight + "kg");
	}	

}
