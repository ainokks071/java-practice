package classinstance;

public class InitializationTest {

	public static void main(String[] args) {

		Truck truck = new Truck(1, "붕붕이");
		
		System.out.println(truck.num + " " + truck.name + " " + truck.engine.type); //1 붕붕이 1만cc

	}

}

class Truck {
	
	//기본형 인스턴스 변수
	int num;
	//참조형 인스턴스 변수
	String name;
	
	Engine engine; 
	
	
	Truck(int num, String name) {
		this.num = num;
		this.name = name;
		this.engine = new Engine("1만cc");
	}
	
}

class Engine {

	String type;
	
	Engine(String type) {
		this.type = type;	
	}
	
}
