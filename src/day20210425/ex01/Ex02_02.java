package day20210425.ex01;

import java.util.Arrays;

public class Ex02_02 {
	public static void main(String[] args) {
		System.out.println("배열 생성");
		int[] num = new int[10];

		System.out.println("배열에 값 삽입");
		try {
			for(int i = 0; i < 10; i++) {
				num[i+1] = i+1;
			}
		}catch(ArithmeticException e) {
			System.out.println("최대 index값을 넘었다. 값을 못넣는다.");
			e.printStackTrace();
		}
		
		System.out.println("배열 내용 출력");
		System.out.println(Arrays.toString(num));
		
		System.out.println("끝");
	}
}
