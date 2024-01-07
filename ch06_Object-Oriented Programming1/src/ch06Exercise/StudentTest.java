package ch06Exercise;

public class StudentTest {


	public static void main(String[] args) {

		Student s = new Student("홍길동", 1, 1, 100, 60, 76);

		System.out.println(s.info());
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());
	}

}


class Student {
	
	String name; //홍길
	int ban; //1
	int no; //1
	int kor; //100점 
	int eng; //60점 
	int math; //76점 
	
	int sum; 
	double avg;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.sum = kor + eng + math;
		this.avg = sum / 3.0;
	}
	

	String info() {
		return this.name + ", " + this.ban + ", " + this.no + ", " + this.kor + ", "
		+ this.eng + ", " + this.math + ", " + this.sum + ", " + this.avg;
	}
	

	
	int getTotal() {
		return this.sum;
	}
	
	double getAverage() {
		return this.avg;
	}
	
	
	
}

