package varex;
 
public class VarEx1 {

	public static void main(String[] args) {
		
		//지역변수는 반드시 초기화 하자!!
		//지역변수 : 선언과 동시에 초기화하는 것이 좋다.

		int grade; 
		//System.out.println(grade); 지역변수는 초기화해야만, 읽을 수 있다.
		
		// *** 변수 선언
		int age;
		// *** 값 저장
		age = 33;
		System.out.println(age);
		// 변수 선언과 값 저장을 한번에!
		int year = 2023;
		System.out.println(year);		
		
		/* 변수의 필요성 */
		
		// if) 변수 사용 x -> 매번 값을 일일히 바꿔줘야한다.
		
		System.out.println(10+2);
		System.out.println(10-2);
		System.out.println(10*2);
		System.out.println(10/2);
		System.out.println();
		
		System.out.println(8+4);
		System.out.println(8-4);
		System.out.println(8*4);
		System.out.println(8/4);
		System.out.println();
		
		// if) 변수 사용 o -> 변수에 저장된 값만 한 번 바꿔주면 된다.
		
		int x = 8, y = 4;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
	}

}
