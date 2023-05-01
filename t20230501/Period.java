package t20230501;

public class Period {
	private Day from; //시작일
	private Day to;   //종료일
	

	public Period(Day from, Day to) {
		this.from = from;
		this.to = to;
	}
	
    public Day getFrom() { return new Day(from); }   //시작일 불러오기
    public Day getTo() { return new Day(to); }       //종료일 불러오기
    
    public String toString() {
    	return "{" + from + " ~ " + to + "}";

	}

}
