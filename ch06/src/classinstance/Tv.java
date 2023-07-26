package classinstance;

//TV 클래스(설계도)
public class Tv {

	// 멤버변수(속성) : 인스턴스변수! only 변수 선언만, 클래스 전체에서 사용가능, 객체생성 시 생성. 
	static String power = "Off"; //전원상태 
	static int ch = 7;       //채널 
	
	String color; //색상 


	
	// 멤버메소드(기능)
	void power(int num) {	//전원 켜기, 끄기 기능
		if(num == 0) {
			power = "On!";		
		} else {
			power = "Off!";
		}
	}


	void chModify(String x) {
		
		if(x.equals("+")) {
			ch = ch + 1;
		} else if(x.equals("-")) {
			ch = ch - 1;
		}
	}



}
