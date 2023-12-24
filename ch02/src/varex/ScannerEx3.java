package varex;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름, 나이는 ?");

		String you = sc.nextLine();

		System.out.println(you + "세 이군요!");
	}

}
