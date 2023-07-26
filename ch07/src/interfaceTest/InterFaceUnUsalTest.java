package interfaceTest;

//인터페이스를 사용하지 않았을 때.
public class InterFaceUnUsalTest {

	public static void main(String[] args) {

		User1 user1 = new User1();
		user1.methodU(new Provider1());
		
	}

}



class User1 {
	
	
	//User -> Provider 직접 사용.(User가 Provider에 의존한다.)
	void methodU(Provider1 pro) {
		pro.methodP();
	}
	
}

class Provider1 { //만약, 제공자클래스가 Provider2클래스로 바뀐다면? 사용자클래스도 바뀌어야한다!
	
	void methodP() {
		System.out.println("제공자 메서드가 사용되었습니다.");
	}
}
