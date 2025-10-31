package ex13;

public class Student {
	private String name;  	//학생이름
	private int	   ban;   	//반
	private int	   no;		//번호
	private int	   kor;		//국어점수
	private int    eng;		//영어점수
	private int    math;	//수학점수
	
	Student() {}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public void setNo(int no) {
		this.no = no;
	}

	String getName() {
		return name;
	}
	int getBan() {
		return ban;
	}
	int getNo() {
		return no;
	}
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
    float getAverage() {
    	return Math.round((this.kor + this.eng + this.math)/3.0f * 10) / 10.0f; 
	}
    
    float getAverage2() {
    	float avg = getTotal()/3.0f;
    	return avg; 
	}
    
    void info() {
    	System.out.println(name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ","
    + getTotal() + ","+getAverage());
    }
}
