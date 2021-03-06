package day20210425.homwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Map<String , Employee> emp = new HashMap<>();
		
		emp.put("0001", new Employee("삼성", "서울", 10000));
		emp.put("0003", new Employee("애플", "미국", 20000));
		emp.put("0005", new Employee("샤오미", "중국", 30000));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사번을 입력하세요");
		
		String num = sc.next();
		Employee e = emp.get(num); // 키값이 없는것을 넣으면 null을 반환!!!
		
		if(e != null) {
		System.out.println("이름 : " + e.getName() + " , 연봉 : " + e.getSalary()
								+ " , 주소 : " + e.getAddress());
		}
		else {
			System.out.println("찾으려는 사람이 없음!");
		}
		
		// 입력받은 숫자 이상의 연봉을 받는 사람은?
		System.out.println("연봉을 입력하세요");
		int salary = sc.nextInt();
		
		for(String key : emp.keySet()) {
			Employee e1 = emp.get(key);
			if(e1.getSalary() >= salary) {
				System.out.println(e1.getName()+ " : " + e1.getSalary());
			}
		}
		
		
		
		
	}
}
