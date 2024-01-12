package multiInheritanceTest;

public class MultiInheritanceTest {

	public static void main(String[] args) {
		
		TvDvd tvDvd = new TvDvd();
		
		//상속관계 이용 -> Tv클래스 이용.
		tvDvd.power = true;
		//포함관계 이용. -> Dvd클래스 이용.
		tvDvd.dvd.power = true;

		//따라서, TvDvd클래스는 Tv클래스와 Dvd클래스를 다중상속받은 효과!
		
		tvDvd.play();
		
		tvDvd.dvd.play();
		
	}

}

//다중상속 효과!
class TvDvd extends Tv {
	
	Dvd dvd = new Dvd();
	
//	이건 왜 안돼 ? dvd.power = true;
	
	void play() {
		dvd.play();
	}
	
}

//부모클래스 
class Tv {
	
	boolean power;
	int ch;
	
	void power() {
		this.power = true;
	}
	
	void chUp(){
		this.ch = this.ch + 1;
	}
	void chDown() {
		this.ch = this.ch - 1;
	}
	
}

//포함시킬클래스 
class Dvd {
	
	boolean power;
	
	void power() {
		this.power = true;
	}
	
	void play() {
		System.out.println("play");
	}
	
}
