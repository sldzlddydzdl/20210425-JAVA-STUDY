package ex01;

public class Ex08 {
	public static void main(String[] args) {
		// 예외 객체를 직접 발생시키기
		//System.out.println(10/0);
		
//		new ArithmeticException();
		// 위는 그냥 객체를 생성한거밖에없다.
		throw new ArithmeticException();
		// 위는 이제 예외가 발생한다. 예외를 직접만든거다.
//		System.out.println("끝");
				
	}
}

// nullpointer 예외를 발생 시키는 상황을 만드는 코드를 작성
// 예외 처리하는 내용까지 작성.

// readString 이라는 메서드를 클래스 MyReader라는 메서드로 만들고
// 예외를 throws 하고
// MyReader
// MyReaderTest클래스를 생성하여 readString()메서드를 사용하시오

// 클래스 MyExcept를 생성
// makeException()이라는 메서드에서 파라미터로 숫자를 받고
// 1번이면 캐스트예외
// 2번이면 널포인터예외
// 3번이면 어래이 예외
// 4번이면 아리스매틱 예외
// 를 발생시키도록 구현
// MyExceptionTest 클래스에서
// 사용자로부터 숫자를 입력받아 makeException메서드를 사용하시오.