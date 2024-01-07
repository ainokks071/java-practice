package ch06;


//생성자 사용하지 않고 객체생성하자마자 초기화..
public class InitializationTest2 {

	public static void main(String[] args) {

		Ambulance ambulance = new Ambulance();
		
		System.out.println(ambulance.num + " " + ambulance.name + " " + ambulance.wiper.type); //10 삐용이 쓱싹이 

	}

}

class Ambulance {
	
	//기본형 인스턴스 변수
	int num = 10;
	//참조형 인스턴스 변수
	String name = "삐용이";
	
	Wiper wiper = new Wiper(); 
	
}

class Wiper {

	String type = "쓱싹이";
	
}
