package object;

import java.util.Objects;

public class ObjectTest4 {

	
	//주제 : 모든 class의 최고조상인 Object클래스! -> equals(), hashCode(), toString()에 대해 알아보자. 
	public static void main(String[] args) {
		

		Card c1 = new Card();
		Card c2 = new Card("HEART", 10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		if(c1.equals(c2)) {
			System.out.println(c1 + "과 " + c2 + "는 같다. ");
		} else {
			System.out.println(c1 + "과 " + c2 + "는 다르다. ");
		}
		
		//오버라이딩을 했기 때문에, iv값이 같으면, 같은 해쉬코드값이 나온다.
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
	}

}

class Card {
	
	String kind;
	int number;
	
	Card() {
		this("HEART", 10);
	}
	
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	//Object클래스의 toString() 메서드를 오버라이딩 해보자.
	public String toString() {
		return "[kind : " + kind + ", number : " + number + "]";
	}
	
	//Object클래스의 equals() 메서드를 오버라이딩 해보자. -> equals()를 오버라이딩 했으면, hashCode()도 오버라이딩 해야함.(암기할규칙)
	public boolean equals(java.lang.Object obj) {
		
		if(obj instanceof Card) {
			
			Card c = (Card)obj;
			//문자열 값이 같은지, 다른지 비교할 때 : " ".equals(" ");
			return (this.kind.equals(c.kind) && this.number == c.number);
			
		} else {			
			return false;
		}
		
	}
	
	//Object클래스의 hashCode() 메서드를 오버라이딩 해보자.
	public int hashCode() {
		
		//java.util패키지의 Objects 클래스 : 객체와 관련된 유용한 메서드를 제공하는 util클래스.
		return Objects.hash(kind, number); //매개변수 가변인자 -> 갯수 무관.
	}
	
	
}


