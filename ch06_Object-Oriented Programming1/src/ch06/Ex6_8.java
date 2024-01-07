package ch06;

public class Ex6_8 {

	public static void main(String[] args) {
		
		Test99 t = new Test99();
		System.out.println(t.x + "과 " + t.y);
		
		t.test();
		
	}

}

class Test99 {
	
	//인스턴스변수 : 선언만 해도 기본값으로 초기화됨.
	int x; //0으로 자동 초기화.
	
	int y = x;
	
	
	void test() {
		//지역변수 : 반드시 초기화 해야함!
		int i = 99;
		int j = i;
		System.out.println(i + "와 " + j);
		System.out.println(method1()); 
	}

	static int method1() {
		return 1;
	}
}


