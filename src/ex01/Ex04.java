package ex01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("숫자를 입력하세요");
		try {
			int num = sc.nextInt();			
		}catch(Exception e) {
			System.out.println("예외 발생");
		}finally {
			sc.close();
			System.out.println("클로즈함!");
		}
		// finally는 try 또는 catch 에서 return 이 되도 실행한다.
		
//		NullPointerException
//		참조변수에 객체가 없는데, 메서드를 호출할때
		
//		ClassCastException
//		클래스를 형변환 하려다가 예외가 생겼을때
		
//		IOException
//		입력과 출력에 관련 예외
//		반드시 try-catch를 하게됨 
		
//		Error 는 시스템적인 오류일 가능성이있다.
//		Error는 신경안써도된다.
//		코드로 해결할 문제가 아닐가능성이 많다.
		
		
		
	}
}
