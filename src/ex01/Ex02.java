package ex01;

import java.util.Scanner;

public class Ex02 {
	// 10개짜리 int형 배열을 만들고
	// 배열과 관련된 예외를 발생시켜 보세요.
	public static void main(String[] args) {
		int[] num = new int[10];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < num.length+2; i++) {
			num[i] = sc.nextInt();
		}
		
//		try catch 
//		예외가 발생할 것 같은곳 에 -> try
//		예외가 발생했을 시 수행할 내용 -> catch
		
		
		
	}
	
}
