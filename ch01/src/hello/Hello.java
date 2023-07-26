//ch01프로젝트 -> hello패키지 -> Hello클래스 !
package hello;

public class Hello {

	public static void main(String[] args) {

		//1. System.out.println()메소드를 이용하여 화면에 문자열 출력실습.

		System.out.println("Hello, World!");

		/* cf) 참고 : 자주 사용하는 단축키 모음. (Command + Shift + l : 단축키 보기)

		 * Eclipse >> Settings >> General >> Keys
		 * 
		 * sysout + option + space : System.out.println() 메소드 자동완성!
		 * command + backspace : 한 줄 삭제!
		 * 
		 * Command + +/- : 글자크기 확대/축소
		 * 
		 * Option + Command + down : 아래로 한 줄 복사.
		 * Option + up : 한 줄 위로 이동.
		 * Option + down : 한 줄 아래로 이동.
		 * 
		 * Command + i : 블럭지정 후 자동으로 줄 맞춤.
		 * Command + / : 주석처리.
		 * 
		 * 컬럼 편집 모드 있기는 하나, 잘 사용 안할 것 같음.
		 */

		/* 2.sysout 치고, option + space누르면, 자동완성!
		 * Eclipse >> Settings >> Java >> Editor >> Templates 에서 설정!
		System.out.println("자동완성했습니다. sysout 치고 + option + space!!");*/

		//3. println()와 print()의 차이! >>> 화면에 글자 출력 후, 줄바꿈 유무!!
		System.out.println("안녕하세요");
		System.out.print("저는 ");
		System.out.println("김경수");
		System.out.println("입니다.");

		//4. " " 안에는 단순 문자열.
		System.out.println("3+5");

		//5. " " 없이, 사칙연산하면? -> 위와는 다르게, 계산하여 출력해줌.
		System.out.println(3+5);
		System.out.println(3-5);
		System.out.println(3*5);
		System.out.println(3/5.0);

	}

}
