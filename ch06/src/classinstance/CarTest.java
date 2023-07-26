package classinstance;

//하나의 생성자에서 다른 생성자 호출. 둘의 매개변수 다름.
public class CarTest {

	public static void main(String[] args) {

		
		Car car1 = new Car(); //기본 옵션 : 화이트, 오토, 문4개 
		Car car2 = new Car("red"); //기본 옵션 : 오토, 문4개 //선택옵션 : 레드 
		
		System.out.println(car1.color + " " + car1.gearType + " " + car1.door);
		System.out.println(car2.color + " " + car2.gearType + " " + car2.door);
		
	}

}

class Car {
	
	String color; //차종별로 다름 
	String gearType; //auto
	int door; //4개 
	
	
	//
	Car() {
		this("white", "auto", 4);
	}
	
	//
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	

}
