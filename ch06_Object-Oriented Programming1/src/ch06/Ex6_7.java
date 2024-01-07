package ch06;


//Data객체의 속성인 x의 값에 관심 : 값을 초기화하고, 메서드를 이용해 값 변경 / 값 복사 (참조형매개변수 필요!) 해보고 싶다.

public class Ex6_7 {

	public static void main(String[] args) {

		Data data1 = new Data();
		
		data1.x = 10;
		int num1 = change(data1.x); //1000 //동일한 클래스 내에서는 바로 호출 가능.(static 붙여야 함) //단순 정수값을 전달함.
		System.out.println(num1); //1000
		System.out.println(data1.x); //10 (1000으로 바뀌지 않음!!!) -> 이 방법으로는 x값이 바뀌지 않음.

		Data data2 = new Data();
		data2.x = 10;
		int num2 = change2(data2); //아예 객체의 주소를 전달함!!
		System.out.println(num2); //1000
		System.out.println(data2.x); //1000 (10에서 1000으로 바뀌었음!!)

		//Data객체를생성 -> x값 초기화 -> copy메서드 사용(1. 새로운객체를 만들어서 x값 초기화, 2. 새로운Data타입 변수를 만들어서 주소값 복사)
		Data data3 = new Data();
		data3.x = 10;
		Data tmp = copy1(data3); //객체 생성 x -> 주소값 복사. -> 주소 동일, 값 동일.
		System.out.println(data3); //주소 123
		System.out.println(tmp); //주소 123
		System.out.println(data3.x); //10
		System.out.println(tmp.x); //10

		Data data4 = new Data();
		data4.x = 10;
		Data tmp2 = copy2(data4); //새로운객체 생성 후 값 복사. -> 주소 다름, 값 동일.
		System.out.println(data4); //주소 123
		System.out.println(tmp2); //주소 456
		System.out.println(data4.x); //10
		System.out.println(tmp2.x); //10
	}

	//기본형 매개변수! -> 값을 읽는 것만 가능하다.
	static int change(int x) {
		x = 1000;
		return x;
	}

	//참조형 매개변수! -> 값을 읽고, 변경도 가능하다. //객체의 주소를 전달받아, x값 변경!!
	static int change2(Data data2) {
		data2.x = 1000;
		return data2.x;
	}

	//참조형 매개변수!
	//주소값 복사 
	static Data copy1(Data data3) {
		
		Data tmp = data3;
		
		return tmp;
	}
	
	//참조형 매개변수!
	//값 복사 
	static Data copy2(Data data4) {
		
		Data tmp = new Data();
		
		tmp.x = data4.x;
		
		return tmp;
	}
	
}





class Data {
	
	//인스턴스 변수
	int x;
	
}


