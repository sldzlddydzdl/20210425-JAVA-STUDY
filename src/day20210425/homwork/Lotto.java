package day20210425.homwork;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
	
	public static void main(String[] args) {
		//1.set을이용하여
		//로또번호를 생성하여 출력하시오.
		//1~45까지의 숫자 6개를 랜덤으로 중복없이 만들어서 넣고 출력하는 코드
		
		Set<Integer> lotto = new HashSet<>();
		
		while(lotto.size() < 6) {
			int num1 = (int)(Math.random()*45 + 1);
			lotto.add(num1);
		}
		
		System.out.println(lotto);
		
		
		
		
		
	}
}
