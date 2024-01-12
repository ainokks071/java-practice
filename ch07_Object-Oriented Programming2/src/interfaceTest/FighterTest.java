package interfaceTest;

public class FighterTest {
	public static void main(String[] args) {

		Fightable tank = new Tank(); //Tank tank = new Tank(); 당연히 가능!
		System.out.println(tank.getFighter() + " 너 나와.");
		tank.attack(new Marine());
		
//		ma.stop();  stop메서드는 Unit에 정의되어 있어서 사용 못함.
		
//		System.out.println(tank.toString()); //f가 toString()메서드도 사용할 수 있다. -> 오버라이딩 된 메서드. 조상타입의 참조변수로 사용 가능.

		//Marine객체, Tank객체는 동일한 인터페이스(Fightable)을 구현하므로, 배열로 한번에 관리 가능!!
		//추상화. 애매의 매력. Fightable인터페이스를 구현한 다른 클래스들 존재, 한데 묶을 수 있고, 변동가능..
//		Fightable[] fighters = new Fightable[2];
//		fighters[0] = tank;
//		fighters[1] = ma;
//		for(int i = 0; i < fighters.length; i++) {
//		fighters[i].move(50, 80);
//		}
	}
}

//1. 추상클래스 
abstract class Unit {
	//현재 위치
	int x, y; 
	//추상메서드 
	abstract void move(int x, int y); //지정한 위치로 이동
	//구현메서드
	void stop() { // 그자리에서 정지. 있는 그대로 이상적인 상속.
		System.out.println("멈춥니다.");
	}
}

//2. 인터페이스 
interface Fightable {
	void move(int x, int y); 
	void attack(Fightable f); 
	Fightable getFighter();
}


class Tank extends Unit implements Fightable {
	//int x, y;
	//구현메서드	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + ", " + y + "으로 탱크로 이동!");	
		System.out.println("현위치 : " + this.x + ", " + this.y);	
	}
	//상속받은 메서드
	//	void stop() { 
	//	System.out.println("멈춥니다.");
	//	}
	//구현메서드	
	public void attack(Fightable f) { //인터페이스 Fightable을 구현한 객체만 매개변수로 받겠다!!!
		System.out.println(f + "를 공격!");
	}
	
	//구현메서드	
	public Fightable getFighter() {
		return new Marine();
	}
	
	public String toString() {
		return "Tank";
	}	
}

//실제로 싸우는 unit
class Marine extends Unit implements Fightable {
	//다중상속, 메서드의 선언부 같고 구현부가 달라? 누구의 메서드를 상속받았는지 모르기 때문에 충돌! but 여기서는 내용물 x->충돌가능성x
	
	public void move(int x, int y) {
		System.out.println("Marine" + x + ", " + y + "으로 걸어서 이동!");		
	}
	public void attack(Fightable f) { 
		//인터페이스 Fightable을 구현한 객체만 매개변수로 받겠다!!!
		//참고 : (추상클래스 Unit을 상속받은 객체만 매개변수로 받겠다!!)
		System.out.println(f+"를 공격!"); //f.toString();
	}
	
	//Fightable 인터페이스를 구현한 클래스만 반환하겠다!!
	public Fightable getFighter() {
		return new Tank();
	}	
	
	public String toString() {
		return "Marine";
	}	
}


