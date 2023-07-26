package polymorphism2;


//매개변수의 다형성!
public class PolyMorphismApplication {

	public static void main(String[] args) {



		//제품이름, 제품가격 -> 제품일련번호.
		Tv t1 = new Tv("LG_TV", 1000000);
		Tv t2 = new Tv("SAMSUNG_TV", 1300000);
		Computer c1 = new Computer("한성컴퓨터", 2000000); 
		Computer c2 = new Computer("맥북", 2800000); 

		//보유금액, 보유포인트.
		Buyer b1 = new Buyer("kim", 500000000);
		Buyer b2 = new Buyer("park", 50000000);
		
		b1.buy(t1);
		b2.buy(t1);
		b2.buy(c1);
		b2.buy(t1);
		b1.buy(c2);
		b1.buy(c2);
		
		b1.cart_confirm();
		b2.cart_confirm();
	}

}

class Product {

	String name; //제품의 이름.
	int pdNum;
	int price; //제품 가격 
	int bonusPoint; //구매시 적립 포인트 

	Product(String name, int pdNum, int price) {
		this.name = name;
		this.pdNum = pdNum;
		this.price = price;
		this.bonusPoint = price / 1000;		
	}

}

class Tv extends Product {

	Tv(String name, int price) {
		super(name, 892, price);
	}

}

class Computer extends Product {

	Computer(String name, int price) {
		super(name, 8892, price);
	}

}

class Buyer {


	String name;
	int money;
	int bonusPoint = 0;


	Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	int i = -1;
	Product[] prodArr = new Product[3];

	void buy(Product p) {

		if(this.money < p.price) {

			System.out.println(toString() + "님, 잔액이 부족합니다!");

		} else {


			if(p.pdNum == 892) {

				if(i < 2) {
					
					this.money = this.money - p.price;
					prodArr[i+1] = p;
					i = i+1;
					System.out.println("카트에 담김.");
					System.out.println(this.name+"님, "+ p.name + "("+ p.price + "원, " + p.pdNum + ")" + " 구매완료 ! ");
					this.bonusPoint = this.bonusPoint + p.bonusPoint;
					
				} else {
					
					System.out.println("카트 꽉참.");
				}
				
			} else if(p.pdNum == 8892) {
				
				if(i < 2) {
					
					this.money = this.money - p.price;
					prodArr[i+1] = p;
					i = i+1;
					System.out.println("카트에 담김.");
					System.out.println(this.name+"님, "+ p.name + "("+ p.price + "원, " + p.pdNum + ")" + " 구매완료 !");
					this.bonusPoint = this.bonusPoint + p.bonusPoint;	
					
				} else {
					
					System.out.println("카트 꽉참.");
				}
				
								
				
			}
			
			System.out.println("잔액 : "+ this.money + "원, 적립 포인트 : " + this.bonusPoint + "원");
			 
		}
		
	}
	
	void balance_confirm() {
		System.out.println(this.name+"님의 " + "현재 잔액 : " + this.money + "원, 적립 포인트 : " + this.bonusPoint + "원");
	}
	
	int j = 0;
	void cart_confirm() {
		
		for(; j < prodArr.length; j++) {
			
			System.out.println(prodArr[j].getClass());
		}
		
	}
	
	//Object클래스의 toString() 오버라이딩.
	public String toString() {
		
		return this.name;
	}

}

