package constructor;

public class ConstructorTest3 {

	public static void main(String[] args) {
		
		new Point3();
		
	}

}

class Point3 /*extends Object*/ {
	
	int x;
	int y;
	
	//기본생성자.
	Point3() {
		this(3,3);
	}
	
	Point3(int x, int y) {
		/*super(); = Object();*/
		this.x = x;
		this.y = y;
	}
	
	//생성자내부 첫 줄에는 반드시 다른 생성자를 호출해야한다.
	//그렇지 않으면, 컴파일러가 생성자의 첫 줄에 super(); (조상의 기본생성자)를 삽입한다!!
}


