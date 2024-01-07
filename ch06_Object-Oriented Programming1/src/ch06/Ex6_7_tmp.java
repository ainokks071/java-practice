package ch06;

class Data2 {
	int x;
}

class ChangeData {
	int method1(Data2 d) {
		return d.x = 100;
	}
}

public class Ex6_7_tmp {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		
		ChangeData c = new ChangeData();
		
		System.out.println(c.method1(d));
	}
}



