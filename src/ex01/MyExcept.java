package ex01;

import java.io.IOException;

public class MyExcept {
	
	public void makeException(int num) throws IOException , ClassCastException
		, NullPointerException, ArithmeticException{
		
		if(num == 1) {
			throw new ClassCastException();
		}
		else if(num == 2) {
			throw new NullPointerException("널 이래요~~");
		}
		else if(num == 3) {
			throw new IOException();
		}
		else if(num == 4) {
			throw new ArithmeticException();
		}
	}

}
