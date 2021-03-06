package ex01;

import java.io.IOException;
import java.util.ArrayList;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		MyReader mr2 = null;
		try {
			mr2.readString();
		} catch (Exception e) {
			System.out.println("객체가 NULL입니다.");
			e.printStackTrace();
		}
		
		// NullPointerException 예제
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("자장면");
		food.add("짬뽕");
		food.add("볶음밥");
		food.add(null);
		food.add("노티드 도넛");
		
		for(int i = 0 ; i< food.size(); i++) {
			String str = food.get(i);
			System.out.println(food.get(i));
			
			str.equals("노티드 도넛");
		}
		
		
	}
}
