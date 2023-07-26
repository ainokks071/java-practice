package constructor;

// 모든 생성자는 첫줄에서 다른 생성자를 호출한다!!
public class ConstructorTest {

	public static void main(String[] args) {
		new Circle();
		
	}

}

class Circle extends Point {
	
	int r;
	
	Circle() {
		this(5);
	}
	
	/////////////////생성자 내부 첫줄은 반드시 (다른)생성자호출코드가 와야한다!
	Circle(int r) {
		super(5, 5);
		this.r = r;
	}
	
}

class Point {
	
	int x;
	int y;
	
	Point(int x, int y) {
//		super();
		this.x=x;
		this.y=y;
	}
	
}
