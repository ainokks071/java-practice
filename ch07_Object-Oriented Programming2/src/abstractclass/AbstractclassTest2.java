package abstractclass;

public class AbstractclassTest2 {

	public static void main(String[] args) {

		Unit[] unitArr = {new Marine(), new Tank(), new DropShip()};
		
		for(int i = 0; i < unitArr.length; i++) {
		unitArr[i].move(100, 200);
		}
		
	}

}

abstract class Unit {
	
	int x;
	int y;
	
	abstract void move(int x, int y);
	abstract void stop();
	
}

class Marine extends Unit {
	
	void move(int x, int y) {
		System.out.println(x + ", " + y + "로 걸어서 이동!" );
	}
	
	void stop() {
		System.out.println("정지.");
	}
	
}

class Tank extends Unit {
	
	void move(int x, int y) {
		System.out.println(x + ", " + y + "로 이동!" );
	}
	
	void stop() {
		
		System.out.println("정지.");
	}
	
}

class DropShip extends Unit {
	
	void move(int x, int y) {
		System.out.println(x + ", " + y + "로 이동!" );
	}
	
	void stop() {
		System.out.println("정지.");
	}
	
}
