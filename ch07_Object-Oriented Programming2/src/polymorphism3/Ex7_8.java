package polymorphism3;

import java.util.Arrays;

/* 클래스 : Buyer, Product(Tv, Computer, Audio), main()클래스.
 * 동작 : mian() -> 1. 구매자가 제품을 구입, 장바구니에 담는다.
 * 				   2. 구매한 총 가격, 내역, 포인트점수 출력.
 * */


public class Ex7_8 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer("kim", 10000);
		b1.buy(new Tv()); 
		b1.buy(new Tv()); 
		b1.buy(new Tv()); 
		b1.buy(new Tv()); 
		b1.buy(new Tv()); 
		b1.buy(new Tv()); 
		b1.buy(new Tv()); 
		b1.buy(new Tv()); 
		b1.summary();
	}

}

class Buyer{
	String name; //구매자의 이름
	int money; //잔액
	int bonus; //보유점수
	Product[] products = new Product[10]; //구매내역 
	
	Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	int i = 0;
	void buy(Product p) {
			this.money = this.money - p.price; 
			this.bonus = this.bonus + p.bonus;
			products[i++] = p;
		}
	
	
	int sum = 0;
	void summary() {
		for(int i = 0; i < products.length; i++) {
			if(products[i] == null) {
				break;
			} 
			sum += products[i].price;
		}
		System.out.println("총 구입 액수 : " + sum);
		System.out.println("잔액 : " + this.money + ", 보유 포인트 점수 : " + this.bonus);
		System.out.println("구입물품 : " + Arrays.toString(products));
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
