package instanceoftest;

public class InstanceOfTest {

	public static void main(String[] args) {
		//예상 : 성공 
		FireEngine fe = new FireEngine();
		dowork(fe);
		//예상 : 성공
		Ambulance ab = new Ambulance();
		dowork(ab);
		//예상 : 실패 
		Car c = new Car();
		dowork(c);
	}
	
	//매개변수를 부모 타입으로 받아야, 논리구조에서 자식으로 형변환 하지!!
	static void dowork(Car c) { //호출과 동시에 Car타입으로 형변환 되겠네.
		
		FireEngine fe = null; 
		Ambulance ab = null; 
		
		if(c instanceof FireEngine) {
			fe = (FireEngine)c; //Car -> FireEngine으로..
			System.out.print("??타입 -> FireEngine타입으로 형변환 성공! water() 호출 가능!! ");
			fe.water();
		} else if(c instanceof Ambulance){
			ab = (Ambulance)c;
			System.out.print("??타입 -> Ambulance타입으로 형변환 성공! sound() 호출 가능!! ");
			ab.sound();
		} else {
			System.out.println("??타입 -> FireEngine타입 or Ambulance타입으로 형변환 실패!!");
		}
	}
}

class Car {
	
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{ 
	
	void water() {
		System.out.println("water!!!");
	}
	
}

class Ambulance extends Car{ 
	
	void sound() {
		System.out.println("삐용삐용!!!");
	}
	
}
