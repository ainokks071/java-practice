package interfaceTest;

public class InterFaceUsalTest1 {
	public static void main(String[] args) {
		AA aa = new AA();
//	 	1. A가 B를 사용하다가,
		aa.methodAA(new BB());
//		2. C를 사용하게 되었다.
		aa.methodAA(new CC());
	}
}

// 3. 그럼에도 불구하고, A는 껍데기인 I와 관계가 있기때문에, 변경이 없다.
// [A <-> I] <--- B/C/D....
class AA {
	void methodAA(II ii) {
		ii.methodII();
	}
}

//껍데기 
interface II {
	void methodII();
}

//알맹이1
class BB implements II{
	public void methodII() {
		System.out.println("methodBB");
	} 
}
//알맹이2
class CC implements II{
	public void methodII() {
		System.out.println("methodCC");
	} 
}
