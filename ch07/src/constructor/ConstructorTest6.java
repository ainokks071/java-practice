package constructor;

//난 이게 제일 맘에 든다.
public class ConstructorTest6 {

	public static void main(String[] args) {
		//x : 원의 x좌표, y : 원의 y좌표, r : 원의 반지름.
		Circle6 c = new Circle6(5,5,10);
		
		System.out.println(c);
	}

}

class Circle6 extends Point6 {
	
	int r;
	
	Circle6(int x, int y, int r) {
		//생성자 첫 줄에서 super(); 호출!! 따라서, Point5클래스에 따로 기본생성자 만들어줬음.
		super(x, y);
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle6 객체 [반지름 r=" + r + ", x=" + x + ", y=" + y + "]";
	}
	
}

class Point6 /*extends Object*/{
	
	int x;
	int y;

	Point6(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
