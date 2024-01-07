package ch06;


public class CardTest {

	public static void main(String[] args) {

		Card.width = 99;
		Card.height = 200;

		Card[] cardArr = new Card[3];
		
		cardArr[0] = new Card();
		cardArr[0].color = "red";
		cardArr[0].shape = "diamond";
		System.out.println(cardArr[0].toString());
		
		
		cardArr[1] = new Card();
		cardArr[1].color = "blue";
		cardArr[1].shape = "clover";
		System.out.println(cardArr[1].toString());

		cardArr[2] = new Card();
		cardArr[2].color = "black";
		cardArr[2].shape = "triangle";
		System.out.println(cardArr[2].toString());

		//클래스변수 값 변경 -> 카드 3개(객체 3개) 모두 바뀜!!
		Card.width = 500;
		Card.height = 1000;

		System.out.println(cardArr[0].toString());
		System.out.println(cardArr[1].toString());
		System.out.println(cardArr[2].toString());

		
//		sagi(cardArr);
		System.out.println(copy(cardArr).toString());
		
	}
	
	static Card copy(Card[] x) {
		
		Card copy = new Card();
		
		copy.color = x[2].color;
		copy.shape = x[0].shape;
		Card.height = 999;
		Card.width = 999;
		
		return copy;
		
	}

}

class Card {

	//폭, 높이, 색상, 모양

	static int width;
	static int height;

	String color;
	String shape;


	@Override
	public String toString() {
		return "Card [color=" + color + ", shape=" + shape + ", width=" + width + ", height=" + height + "]";
	}

}