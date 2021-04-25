package ex01;

import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		try {
			String str = readString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 함수안에서 처리해주지 않았으니 사용하는곳에서 처리해라
	}
	
	public static String readString() throws IOException {
									// 이메서드를 호출할때 처리해줘야하는 예외를 적어준다.
									// 이메서드를 호출하는쪽이 예외처리를 해라
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하세요");
		
		System.in.read(buf);
		
		return new String(buf);
	}
	
}

