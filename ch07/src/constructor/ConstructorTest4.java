package constructor;

public class ConstructorTest4 {

	public static void main(String[] args) {
		
		//반지름 10cm짜리 원.
		Circle4 c = new Circle4(10);
		System.out.println(c);
		
	}

}

class Circle4 extends Point4 {
	
	int r;
	
	Circle4(int r) {
		//반지름은 10이고, x, y좌표가 5,5임.
		super(5,5);
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle4 객체 [반지름 r=" + r + ", x=" + x + ", y=" + y + "]";
	}
	
}

class Point4 /*extends Object*/{
	
	int x;
	int y;
	
	public Point4(int x, int y) {
		//컴파일러가 생성자 첫 줄에 super(); 자동추가해줌!!
		this.x = x;
		this.y = y;
	}


	
}
