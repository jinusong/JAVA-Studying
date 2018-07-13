package 표준API의_함수적인터페이스;

import java.util.function.Predicate;

// 표준 API의 함수적 인터페이스
// and(), or(), negate() 디폴트 메소드와 isEqual() 정적 메소드
// IsEqual() 정적 메소드

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8: " + predicate.test(null));
		
		predicate = Predicate.isEqual(null);
		System.out.println("Java8, null: " + predicate.test("java8"));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8: " + predicate.test("Java8"));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java7, Java8: " + predicate.test("Java7"));
	}
}
