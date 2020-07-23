package chapter03;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			File f = new File("test.txt");
			if (f.createNewFile()) {
				System.out.println("파일 생성:" + f.getName());
			} else {
				System.out.println("같은 이름의 파일이 이미 존재합니다");
			}
		}

		catch(IOException e) {
			System.out.println("오류가 발생하였습니다");
			e.printStackTrace();
		}
		
	}

}
