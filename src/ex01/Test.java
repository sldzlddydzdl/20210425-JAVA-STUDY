package ex01;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		String ob = sc.next();
//		int num = 1234;
//		try {
//			if(num == Integer.parseInt(ob)) {
//				System.out.println("이름이 같습니다.");
//			}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("숫자를 입력해주세요");
//		}		
	}
	
	public static void ex01() throws IOException {
		MyReader mr2 = null;
		mr2.readString();
		System.out.println("mr2 객체가 NULL입니다.");
		ex02();
	}
	
	public static void ex02() throws IOException {
		MyReader mr3 = null;
		mr3.readString();
		System.out.println("mr3 객체가 NULL입니다.");
		ex01();
	}
	

}
