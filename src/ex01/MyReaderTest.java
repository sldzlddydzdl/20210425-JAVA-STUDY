package ex01;

import java.io.IOException;
import java.util.Scanner;

public class MyReaderTest {
	public static void main(String[] args) {
		
		
		MyReader mr = new MyReader();
		
		try {
			mr.readString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("예외 발생");
		}
		
	
	}
}
