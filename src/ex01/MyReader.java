package ex01;

import java.io.IOException;

public class MyReader {
	public String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하세요");

		System.in.read(buf);

		return new String(buf);
	}

}
