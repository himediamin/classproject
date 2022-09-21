package chapter06.Exam;

public class Student {

	private String name;
	private int korScore;
	private int engScore;
	private int matScore;

	public Student(String name, int korScore, int engScore, int matScore) {
		super();
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMatScore() {
		return matScore;
	}

	public void setMatScore(int matScore) {
		this.matScore = matScore;
	}
	public int sum() {
		
		int result = 0;
		result = korScore + engScore + matScore;
		return result;
	}
	
	
	public float avg() {
		return sum()/3f;
	}

	
	
	public void printData() {
		System.out.print(this.name + "\t" + this.korScore + "\t" + this.engScore + "\t" + this.matScore + "\t" 
				+ sum() + "\t" + avg());
		
	}
	
//	public static void main(String[] args) {
//		
//		Student s = new Student("학생1", 100, 90, 80);
//		
//		System.out.print("합 : " + s.sum());
//		
//		System.out.print("평균 : " + s.avg());
//		
//		s.printData();
//		
		
		
//	}
	


}
