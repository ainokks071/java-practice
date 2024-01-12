package abstractclass;

public class AbstractclassTest {

	public static void main(String[] args) {

		//다형성! 서로 다른 객체를 하나의 배열에 묶을 수 있다.
		Player[] players = new Player[2];
		players[0] = new AudioPlayer();
		players[1] = new DvdPlayer();

	}

}

//추상클래스 : 강제성 부여 -> 상속받아서 구현해라. (부모클래스 역할)
abstract class Player {

	boolean pause; 
	int currentPos;	
	//
	//	public Player(boolean pause, int currentPos) {
	//		this.pause = pause;
	//		this.currentPos = currentPos;
	//	}
	//
	abstract void play(); //현위치부터재생.
	abstract void pause(); //일시정지.
	abstract void stop(); //중지.
	abstract void play(int pos); //지정위치부터재생.
	abstract void state(); //재생 상태, 재생 위치 확인 

}

//상속받아서 구현해라.
class AudioPlayer extends Player {

	//	public AudioPlayer() {
	//		super();
	//	}

	public void play() {

		if(this.pause == false) {
			System.out.println("현 위치인 "+this.currentPos + "초 부터 100초 재생.");
			pause = true;
			currentPos  += 100;
		} else {
			System.out.println("현재 재생중입니다." + pause);

		}

	}

	//메서드 오버로딩 
	void play(int currentPos) {
		System.out.println("지정한 " + currentPos + "초 부터 100초 재생.");
		pause = true;
		this.currentPos = 0;
		this.currentPos = currentPos + 100;		
	}

	void pause() {
		if(this.pause == true) {
			pause = false;
			System.out.println(this.currentPos + "초 에서 일시정지.");
		} else {
			System.out.println("현재 일시정지 상태입니다." + pause);
		}
	}

	void stop() {
		System.out.println("재생 중지!");
		pause = false;
		this.currentPos = 0;
	}	


	void state() {
		System.out.println("재생상태 : " + pause + ", 재생위치 : " + currentPos);
	}

}

class DvdPlayer extends AudioPlayer {

	boolean display;
}
