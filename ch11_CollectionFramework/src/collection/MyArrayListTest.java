package collection;

public class MyArrayListTest {

	public static void main(String[] args) {
		
		//4명의 학생 객체 생성.
		Student s1 = new Student("김경수", 6, "햇님반", 1);
		Student s2 = new Student("김철수", 5, "달님반", 8);
		Student s3 = new Student("김만수", 4, "별님반", 9);
		Student s4 = new Student("김홍수", 3, "똥님반", 2);
		
		// CRUD : create, read, update, delete
		
		//수정사항.
		Student s5 = new Student("김찬수", 11, "홍님반", 99);
		
		MyArrayList myList10 = new MyArrayList(10);
		myList10.add(s1);
		myList10.add(s2);
		myList10.printAll();
		
		//리스트에 저장. create
//		MyArrayList myList = new MyArrayList(s1,s2, s3, s4);
//		
//		System.out.println("== 전체 학생 조회 ==");
//		myList.printAll();
//		System.out.println("== 특정 학생 조회 ==");
//		myList.print(s4);
//		
//		System.out.println("== 특정 학생 삭제 후 전체 학생 조회 ==");
//		myList.delete(s1);
//		myList.printAll();
//		System.out.println("== 특정 학생 수정 후, 전체 학생 조회 ==");		
//		myList.modify(3, s5); //update
//		myList.printAll();
		
		//저장된 리스트 출력.
		
	}
	
}

//ArrayList의 내부 동작 원리(메서드!)를 직접 만들어보자.
class MyArrayList {
	
	//배열은 반드시 방이 몇 개 있는지 설정해주고 시작한다..
	
	Object[] myArray;

	MyArrayList(int initialCapacity) {

		myArray = new Object[i];

	}
	
	int i;
	boolean add(Object o) {
		if(o instanceof Student) {
			myArray[i] = (Student)o;
			i = i+1;
			return true;
		} else {			
			return false;
		}
	}
	
	
//	int x;
//	Object[] subList(int i, int j) {
//		
//		if(myArray[i] ) {}
//		
//		return null;
//	}
	
	
	MyArrayList(Object o1, Object o2, Object o3, Object o4) {
		
		myArray = new Object[4];
		
		myArray[0] = o1;
		myArray[1] = o2;
		myArray[2] = o3;
		myArray[3] = o4;
	}
	
	
	public void modify(int i, Object o) {
		
		if(myArray[i] instanceof Student && o instanceof Student) {
			
			Student s1 = (Student)myArray[i];
			Student s2 = (Student)o;
			
			s1.setName(s2.getName());
			s1.setGrade(s2.getGrade());
			s1.setClassRoom(s2.getClassRoom());
			s1.setNumber(s2.getNumber());
			
		}
		
	}


	public void delete(Object o) {
		if(o == myArray[0]) {
			myArray[0] = null;
		} else if(o == myArray[1]) {
			myArray[1] = null;
		} else if(o == myArray[2]) {
			myArray[2] = null;
		} else if(o == myArray[3]) {
			myArray[3] = null;
		}
	}


	void printAll() {
		
		for(int i = 0; i < myArray.length; i++) {
			if(myArray[i] instanceof Student) {
				Student s = (Student)myArray[i];
				System.out.println(s.getName() + ", " + s.getGrade() + ", " + s.getClassRoom() + ", " + s.getNumber());
			}
		}
		
	}
	
	void print(Object o) {
		
		
		for(int i = 0; i < myArray.length; i++) {
		
			if(o == myArray[i]) {			
				if(o instanceof Student) {
					Student s = (Student)o;
					System.out.println(s.getName() + ", " + s.getGrade() + ", " + s.getClassRoom() + ", " + s.getNumber());
				}
				
			}
			
		}
//		 else if(o == myArray[1]) {
//			if(o instanceof Student) {
//				Student s = (Student)o;
//				System.out.println(s.getName() + ", " + s.getGrade() + ", " + s.getClassRoom() + ", " + s.getNumber());
//			}
//			
//		} else if(o == myArray[2]) {
//			if(o instanceof Student) {
//				Student s = (Student)o;
//				System.out.println(s.getName() + ", " + s.getGrade() + ", " + s.getClassRoom() + ", " + s.getNumber());
//			}
//		} else if(o == myArray[3]) {
//			if(o instanceof Student) {
//				Student s = (Student)o;
//				System.out.println(s.getName() + ", " + s.getGrade() + ", " + s.getClassRoom() + ", " + s.getNumber());
//			}
//		}
//		
//		for(int i = 0; i < myArray.length; i++) {
//			if(o instanceof Student) {
//				Student s = (Student)o;
//				System.out.println(s.getName() + ", " + s.getGrade() + ", " + s.getClassRoom() + ", " + s.getNumber());
//			}
//		}
		
	}
	
	
	
//	public void print(Object o) {
//		
//		if(o instanceof Student) {
//			Student s = (Student)o;			
//			System.out.println(s.getName() + ", " + s.getGrade() + ", " + s.getClassRoom() + ", " + s.getNumber());
//		}
//		
//	}

	

}

class Student {
	
	
	private String name;
	private int grade;
	private String classRoom;
	private int number;
	
	public Student(String name, int grade, String classRoom, int number) {
		this.name = name;
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	

}
