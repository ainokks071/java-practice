package constructor;

public class ConstructorTest7 {
	public static void main(String[] args) {
		//x : 원의 x좌표, y : 원의 y좌표, r : 원의 반지름.
		Circle7 c = new Circle7(5,5,10); //같은 패키지 내에 있는 클래스는 import 필요 없다.
		System.out.println(c.getLocation());
	}
}

class Circle7 extends Point7 {
	int r;
	
	Circle7(int x, int y, int r) {
//		super(); Point7(); : 조상의 기본생성자 호출 생략 -> but, Point7에 기본생성자 없어서 컴파일에러  
//		super.x = x;
//		super.y = y;
		
// 		모든 생성자의 첫 줄에는 반드시생성자 호출해야한다는 조건에 부합.
		super(x, y); 
		this.r = r;
	}

	@Override
	String getLocation() {
		return x + ", " + y + ", " + r;
	}
}

class Point7 /*extends Object*/{
	int x;
	int y;

	
	Point7(int x, int y) {
//		super(); == Object(); : 조상의 기본생성자 호출 생략
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return x + ", " + y;
	}
	
}
