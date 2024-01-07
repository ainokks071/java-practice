package polymorphism3;

import java.util.Arrays;


public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer("kim", 10000);
		b1.buy(new Tv());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		b1.buy(new Computer());
		
//		구입한 총 가격, 제품 리스트 출력메서드 만들어보기 !
//		b1.summary();
		
		
		System.out.println(b1);
	}

}

class Buyer{
	String name; //구매자의 이름
	int money; //소유 머니
	int bonus; //소유 포인트
//	다형성을 적용한 객체 배열 
	Product[] products = new Product[10]; //구매내역 
	int i = 0;
	
	Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	void buy(Product p) {
		if(p instanceof Tv) {
			this.money = this.money - p.price; 
			this.bonus = this.bonus + p.bonus;
			products[i++] = p;
		}
		
		if(p instanceof Computer) {
			this.money = this.money - p.price; 
			this.bonus = this.bonus + p.bonus;
			products[i++] = p;
		}
	}
	
	@Override
	public String toString() {
		return "이름 : " +this.name + ", 잔액 : " + this.money + ", 포인트 : " + this.bonus + ", 구매내역 : " + Arrays.toString(products);
	}
}

class Product{
	int price; //제품 가격 
	int bonus; //보너스 점수
	
	Product(int price) {
		this.price = price;
		this.bonus = price / 10;
	}
}

class Tv extends Product{
	Tv() {
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product{
	Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
