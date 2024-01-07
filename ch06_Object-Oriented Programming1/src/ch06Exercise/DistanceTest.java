package ch06Exercise;

//두 점 사이의 거리 구하기.
public class DistanceTest {

	public static void main(String[] args) {

		//1. 클래스 메서드로 구현
		System.out.println(Distance.getDistance1(1,1, 2,2));

		//2. 인스턴스 메서드로 구현(생성자에는 내 지점을, 메서드에는 목표지점을)
		Distance distance = new Distance(1,1);
		System.out.println(distance.getDistance2(2,2));
		
	}

}

class Distance {
	
	//1. 클래스 메서드로 구현(주로, 인스턴스변수 이용 안할 때 !)
	static double getDistance1(int x1, int y1, int x2, int y2) {
		return Math.sqrt( ((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)) );
	}

	//2. 인스턴스 메서드로 구현(생성자에는 내 지점을, 메서드에는 목표지점을)
	int x1;
	int y1;
	
	
	Distance(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	
	double getDistance2(int x2, int y2) {
		return Math.sqrt( ((x2-this.x1)*(x2-this.x1))+((y2-this.y1)*(y2-this.y1)) );
	}
	
}
