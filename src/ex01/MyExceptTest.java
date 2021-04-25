package ex01;

import java.io.IOException;
import java.util.Scanner;

public class MyExceptTest {
	public static void main(String[] args) {
		MyExcept me = new MyExcept();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 캐스트예외");
		System.out.println("2번 널포인트예외");
		System.out.println("3번 어래이 예외");
		System.out.println("4번 아리스매틱 예외");
		System.out.println("1~4번을 골라주세요");
		int num = sc.nextInt();
		try {
			me.makeException(num);
		} catch (ClassCastException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("NULL 이다");
			e.getMessage();
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
