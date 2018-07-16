package List_컬렉션;

import java.util.Arrays;
import java.util.List;

// List컬렉션
// ArrayList
// Arrays.asList() 메소드

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value: list2) {
			System.out.println(value);
		}
	}
}
