package ex01;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int[] numArr = new int[5];
		
		// ArrayIndexOutOfBoundsException
		// ArithmeticException 두개가 발생할 상황이 생기면?
		Scanner sc = new Scanner(System.in);
		
		try {
			for(int i = 1; i <= 5; i++) {
				int num = (int)(Math.random()*5);
				numArr[i] = 10/num;
			}
		}catch(ArithmeticException e) { // 먼저체크
			System.out.println("0으로 나누려 했네!!");
		}catch(ArrayIndexOutOfBoundsException e) { // 나중에체크
			System.out.println("배열의 크기를 넘어가려 했음!");
		}finally {
			sc.close();
		}
		
//		오류가 발생하였건 발생하지 않앗껀 항상 실행되어야 하는
//		코드는 finally 블록에 넣을수 있다
	
//		Scanner 라는 객체를 닫을때
//		파일입출력이라는 아이를 닫을때
//		데이타베이스 연결한 애를 닫을때 finally 를 쓴다.
		
	}
	
}
