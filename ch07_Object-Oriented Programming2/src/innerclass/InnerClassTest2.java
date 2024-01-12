package innerclass;

public class InnerClassTest2 {

	public static void main(String[] args) {
//		 BB클래스는 내부 클래스이므로, 다른 클래스에서 접근 불가.
//		 BB b = new BB();
//		 b.methodB();
	}

}

class AA {
//	멤버변수 i
	int i =100;
	BB b = new BB();
	
	//AA의 내부 클래스	-> 마치 AA의 멤버처럼 다루어짐.
	//캡슐화 : BB는 AA안에서만 사용된다.	
	class BB {
		void methodBB() {
//			AA a = new AA();
//			System.out.println(a.i);
			
//			객체 생성 없이, AA의 멤버에 직접 접근 가능.
			System.out.println(i);
		}
	}
}


class CC {
//	BB클래스는 내부 클래스이므로, 다른 클래스에서 접근 불가.
//	외부에서 내부클래스인 BB를 사용하려면, 일단 AA객체를 생성해야한다.
//	BB b = new BB();
}
