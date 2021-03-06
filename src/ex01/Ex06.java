package ex01;

import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		String str = readString();
		System.out.println(str);
	}
	
	// 콘솔로부터 문자를 입력받아 buf에 담는 메서드
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하세요");
		
		
		// 디버그시에 미리 체크해서 예외를 처리하는 
		// 코드를 작성하도록! -> checked exception
		try {
			System.in.read(buf);
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		return new String(buf);
	}
}
