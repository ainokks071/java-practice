package ch08_04;

import java.io.File;
import java.io.IOException;

public class Ex8_10 {
//		File file = new File("파일.txt");
//		file.createNewFile();

	public static void main(String[] args) {
		
		String fileName = "";
		File file = makeFile(fileName);
		
		System.out.println(file.getName() + "이 생성되었습니다.");

	}
	
	
//	파일 이름을 받아서 파일 생성하는 메서드 
//	파일 이름이 없다면 제목없음.txt로 파일 생성할 것.
	static File makeFile(String fileName) {
		
		if(fileName == null || fileName.equals("")) {
			fileName = "제목없음.txt";
			File file = new File(fileName);
			
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return file;
		}
		
		
		File file = new File(fileName);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}

}
