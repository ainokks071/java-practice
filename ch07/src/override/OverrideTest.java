package override;


public class OverrideTest {

	public static void main(String[] args) {
		//초기화하고 출력! 깔끔하다.
		Circle c = new Circle(5,5,10);
		System.out.println(c);

		//Circle c객체의 속성 출력하는 세 가지 방법.
		
		//방법1. 원시적인 방법.
		System.out.println(c.x + ", " + c.y + ", " + c.r);
		//방법2. void 메서드로 가서 출력하고 돌아옴.
		c.getLocation();
		//방법3. String 메서드로 문자열 반환받아와서 출력.
		// 오버라이딩 해줘야함! 안해주면, 객체의 주소값을 출력해버림!!
		System.out.println(c.toString());
		System.out.println(c);
		System.out.println();
		
		Point p = (Point)c; 
		//참조변수 c는, 자식객체인 Circle객체를 가리키고 있다.
		//형변환을 했지만, p 역시 Circle객체를 가리키고 있다.
		//따라서, Circle클래스의 getLocation()메서드가 호출됨!!
		p.getLocation();
		Point p2 = new Point(5,10);
		p2.getLocation();
	}

}

class Circle extends Point {
	
	//원의 반지름.
	int r;
	
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}

	
	//오버라이딩 메서드 
	void getLocation() {
		System.out.println(this.x + ", " + this.y + ", " + this.r);
	}


	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + "]";
	}
	
	//Object클래스의 toString()는 public이 붙어있어서 반드시 public으로 오버라이딩 해줘야함.
//	public String toString() {
//		
//		return this.x + ", " + this.y + ", " + this.r;
//	}
	
}

class Point {
	
	int x; //점의 x좌표.
	int y; //점의 y좌표.
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//점의 위치 표시 메서드.
	void getLocation() {
		System.out.println(this.x + ", " + this.y);
	}
	
}
