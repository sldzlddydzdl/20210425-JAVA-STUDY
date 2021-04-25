package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 예외(exception) : 잘못된 코드, 부정확한 데이터, 예외적인 상황에 의하여 발생하는 오류
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나누려는 숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if(num != 0) {
			System.out.println(10/num);
		}else {
			System.out.println("0으로 나눌 수 없음");
			Ex01.main(args);
		}
		
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at ex01.Ex01.main(Ex01.java:8)
		
//		java.lang.ArithmeticException : 수학적 오류
//		/ by zero : 너 0으로 나누고있어
		
		System.out.println("끝");
		
		
	}
}
