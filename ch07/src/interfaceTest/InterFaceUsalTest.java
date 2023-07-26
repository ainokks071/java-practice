package interfaceTest;


//목표 : 사용자 클래스인 Use클래스의 변경 X
public class InterFaceUsalTest {
				
	public static void main(String[] args) {
				
		Use user = new Use();
		user.methodU(new Provide());
				
	}

}

//사용자 클래스에서, 매개변수 변경할 필요 없음!! 매개변수의 다형성!
// User가 Provider를 직접 사용 X Interface로 접근!!

// 목표 : 사용자클래스인 Use클래스의 변경 X
class Use {
	
	//Provide객체, Provide2객체 둘 다 In 인터페이스를 구현하고있음. 따라서, 변경불필요!!
	void methodU(In in) {
		in.methodIn();
	}
	
}

// if) 알맹이만 Provide2로 교체 시, 
class Provide implements In { //만약, 제공자 클래스가 Provide2로 바뀐다면? -> 사용자 클래스는 변경할 필요 없다!(매개변수의 다형성!)
	
	public void methodIn() {
		System.out.println("제공자 메서드가 사용되었습니다.");
	}

}

class Provide2 implements In { 
	
	public void methodIn() {
		System.out.println("제공자 메서드가 사용되었습니다.");
	}
	
}

//껍데기는 그대로,
interface In {
	
	void methodIn();
	
}