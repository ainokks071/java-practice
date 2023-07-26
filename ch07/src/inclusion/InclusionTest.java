package inclusion;

public class InclusionTest {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 1;
		c.r = 5;

		c.location();
		c.area();
		c.test();
	}

}
//포함관계 : circle객체에 point객체가 포함됨.
class Circle {
	
	//포함관계 생성방법1 : 참조변수 선언 후 명시적초기화까지.
	Point p = new Point();
	//원의 반지름 길이 
	int r;
	
	//포함관계 생성방법2 : 생성자이용.
	
	Point p2;
	Circle() {
		p2 = new Point();
	}
	
	
	
	void location() {
		System.out.println("원점의 위치는 (" + p.x + ", " + p.y + ") 입니다.");	

	}
	void area() {
		System.out.println("원의 넓이는 " + (3.14*r*r) + "입니다.");
	}
	
	void test() {
		System.out.println(p2); //주소 
		System.out.println(p2.x); //0
		System.out.println(p2.y); //0
	}
}

class Point {
	//원의 중심 좌표 
	int x;
	int y;
}
