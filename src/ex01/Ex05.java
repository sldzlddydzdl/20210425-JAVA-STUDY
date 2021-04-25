package ex01;

public class Ex05 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) { // 따라서 위에 올라와야한다.
			// TODO: handle exception
			System.out.println("숫자 관련 예외");
		}catch (Exception e) {
			System.out.println("예외 발생");
		}
		
		// 위에서 이미 에외를 잡아서 요 catch 까지 못온다
//		catch(ArithmeticException e) { 
//			// TODO: handle exception
//			System.out.println("숫자 관련 예외");
//		}
		
		// 나중에 상황마다 예외를 처리해야하는것을 해야
		// 사용자가 무슨예외가 발생했는지 알수있다.
	}
}
