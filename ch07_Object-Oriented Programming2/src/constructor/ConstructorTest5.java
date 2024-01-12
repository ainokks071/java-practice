package constructor;

public class ConstructorTest5 {

	public static void main(String[] args) {
		
		Circle5 c = new Circle5(5,5,10);
		System.out.println(c);
		
	}

}

class Circle5 extends Point5 {
	
	int r;
	
	Circle5(int x, int y, int r) {
		//생성자 첫 줄에서 super(); 호출!! 따라서, Point5클래스에 따로 기본생성자 만들어줬음.
		super.x = x;
		super.y = y;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle5 객체 [반지름 r=" + r + ", x=" + x + ", y=" + y + "]";
	}
	
}

class Point5 /*extends Object*/{
	
	int x;
	int y;

	Point5() {}
	
	Point5(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
