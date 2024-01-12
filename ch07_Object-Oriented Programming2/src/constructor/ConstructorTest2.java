package constructor;

public class ConstructorTest2 {

	public static void main(String[] args) {
		new Circle2();
	}

}

class Circle2 {
	
	int r;

	
	//////////////생성자 내부 첫줄은 반드시 다른 생성자호출코드가 와야한다!
	Circle2() {
		//super(); 아무것도 적지 않으면, 컴파일러가 자동추가해주고, 생략되어있음.
		this(5); //적어주면 적어준대로 호출!
		}
	
	//생성자 내부 첫줄은 반드시 다른 생성자호출코드가 와야한다!
	Circle2(int r) {
		//super(); 아무것도 적지 않으면, 컴파일러가 자동추가해주고, 생략되어있음.
		this.r = r;
	}
	
}


